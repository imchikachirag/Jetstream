package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceServiceConnector;
import com.force.sdk.streaming.util.ForceStreamingResource;
import com.force.sdk.streaming.model.PushTopic;
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

    private final ForceServiceConnector connector;
    private final BayeuxClient bayeuxClient;
    private static final Logger LOGGER = LoggerFactory.getLogger(ForceBayeuxClient.class) ;

    @Inject
    public ForceBayeuxClient(ForceServiceConnector connector, BayeuxClient bayeuxClient) throws ConnectionException {
        this.connector = connector;
        this.bayeuxClient = bayeuxClient;
        this.bayeuxClient.setCookie("sid", connector.getConnection().getSessionHeader().getSessionId());
    }

    public void handshake() throws InterruptedException {
        bayeuxClient.handshake();
        boolean shaken = bayeuxClient.waitFor(30000, BayeuxClient.State.CONNECTED);
        if (shaken)
            LOGGER.info("Handshake complete");
        else {
            LOGGER.info("Unable to complete handshake. Disconnecting from service.");
            bayeuxClient.disconnect();
        }
    }

    public void subscribeTo(PushTopic topic, ClientSessionChannel.MessageListener messageListener) {
        bayeuxClient.getChannel(getChannelName(topic)).subscribe(messageListener);
    }

    private String getChannelName(PushTopic topic) {
        return ForceStreamingResource.CHANNEL_PREFIX.getValue() + topic.getName();
    }
}
