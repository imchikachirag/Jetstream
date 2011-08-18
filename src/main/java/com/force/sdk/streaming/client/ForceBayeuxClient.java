package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceServiceConnector;
import com.force.sdk.streaming.exception.ForceStreamingException;
import com.force.sdk.streaming.model.PushTopic;
import com.force.sdk.streaming.util.ForceStreamingResource;
import com.google.inject.Inject;
import com.sforce.ws.ConnectionException;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.client.BayeuxClient;
import org.cometd.client.transport.ClientTransport;
import org.cometd.client.transport.LongPollingTransport;
import org.eclipse.jetty.client.ContentExchange;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.http.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

import java.util.HashMap;
import java.util.Map;

/**
 * Client for connecting to the Force.com Streaming API. The client is configured by injecting
 * a connector, client, and URL from ForceStreamingClientModule.
 * @author naamannewbold
 */
public class ForceBayeuxClient {

    final BayeuxClient bayeuxClient;
    final ForceServiceConnector connector;
    final static String OAUTH_OPTION = "oauthSid";
    private static final Logger LOGGER = LoggerFactory.getLogger(ForceBayeuxClient.class) ;
    private static final int HANDSHAKE_TIMEOUT = 5000;

    @Inject
    public ForceBayeuxClient(ForceServiceConnector connector, HttpClient httpClient, String baseUrl) throws Exception {
        requireConnection(connector);
        this.connector = connector;
        LOGGER.debug("Setting up bayeux client for " + baseUrl);
        bayeuxClient = setupBayeuxClient(httpClient, baseUrl);
    }

    private BayeuxClient setupBayeuxClient(HttpClient httpClient, String baseUrl) throws Exception {
        Map<String, Object> clientOptions = new HashMap<String, Object>() {{
            put(ClientTransport.TIMEOUT_OPTION, 10000);
//            put(OAUTH_OPTION, connector.getConnection().getSessionHeader().getSessionId());
        }};
//        httpClient.setProxy(new Address("127.0.0.1", 9595));
        LOGGER.debug("Starting HttpClient", httpClient);
        httpClient.start();

        return new BayeuxClient(baseUrl, new OauthLongPollingTransport(clientOptions, httpClient, connector));
    }

    /*
     * Extension of the LongPollingTransport to add the OAuth Authorization header to
     */
    private static final class OauthLongPollingTransport extends LongPollingTransport {

        private ForceServiceConnector connector;

        public OauthLongPollingTransport(Map<String, Object> options, HttpClient httpClient) {
            this(options, httpClient, null);
        }

        public OauthLongPollingTransport(Map<String, Object> options, HttpClient httpClient, ForceServiceConnector connector) {
            super(options, httpClient);
            this.connector = connector;
        }

        @Override
        protected void customize(ContentExchange exchange) {
            super.customize(exchange);
            String oauthSid = null;
            try {
                oauthSid = connector.getConnection().getSessionHeader().getSessionId();
            } catch (ConnectionException e) {
                // we have to ignore this exception in order to utilize the customize method
                LOGGER.warn(Marker.ANY_MARKER, "Unable to get Session Id", e);
            }

            LOGGER.debug("Adding OAuth header to request: OAuth " + oauthSid);
            exchange.setRequestHeader(HttpHeaders.AUTHORIZATION, "OAuth " + oauthSid);
        }
    }

    private void requireConnection(ForceServiceConnector connector) throws ForceStreamingException, ConnectionException {
        if (connector == null || connector.getConnection() == null || connector.getConnection().getSessionHeader().getSessionId() == null)
            throw new ForceStreamingException("Invalid connection provided.");
    }

    public void handshake() throws InterruptedException {
        LOGGER.debug("Handshaking...");
        bayeuxClient.handshake(HANDSHAKE_TIMEOUT);
        bayeuxClient.waitFor(HANDSHAKE_TIMEOUT, BayeuxClient.State.CONNECTING);

        if (bayeuxClient.isHandshook())
            LOGGER.info("Handshake complete");
        else {
            LOGGER.info("Unable to complete handshake. Disconnecting from service.");
            bayeuxClient.disconnect();
        }
    }

    public void subscribeTo(PushTopic topic, ClientSessionChannel.MessageListener messageListener) throws InterruptedException {
        if (!bayeuxClient.isHandshook()) {
            handshake();
        }

        LOGGER.debug("Subscribing to " + getChannelName(topic));
        bayeuxClient.getChannel(getChannelName(topic)).subscribe(messageListener);
    }

    private String getChannelName(PushTopic topic) {
        return ForceStreamingResource.CHANNEL_PREFIX.getValue() + topic.getName();
    }
}