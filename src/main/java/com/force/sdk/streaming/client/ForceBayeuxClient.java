package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceServiceConnector;
import com.force.sdk.streaming.exception.ForceStreamingException;
import com.force.sdk.streaming.model.PushTopic;
import com.force.sdk.streaming.util.ForceStreamingResource;
import com.google.inject.Inject;
import com.sforce.ws.ConnectionException;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.client.BayeuxClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author naamannewbold
 */
public class ForceBayeuxClient {

    private final BayeuxClient bayeuxClient;
    private static final Logger LOGGER = LoggerFactory.getLogger(ForceBayeuxClient.class) ;
    private static final int HANDSHAKE_TIMEOUT = 10000;

    @Inject
    public ForceBayeuxClient(ForceServiceConnector connector, BayeuxClient bayeuxClient) throws ConnectionException, ForceStreamingException {
        requireConnection(connector);
        this.bayeuxClient = bayeuxClient;
        this.bayeuxClient.setCookie("sid", connector.getConnection().getSessionHeader().getSessionId());
    }

    private void requireConnection(ForceServiceConnector connector) throws ForceStreamingException, ConnectionException {
        if (connector == null || connector.getConnection() == null || connector.getConnection().getSessionHeader().getSessionId() == null)
            throw new ForceStreamingException("Invalid connection provided.");
    }

    public void handshake() throws InterruptedException {
        LOGGER.debug("Handshaking...");
        bayeuxClient.handshake();
        boolean shaken = bayeuxClient.waitFor(HANDSHAKE_TIMEOUT, BayeuxClient.State.CONNECTED);
        if (shaken)
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
