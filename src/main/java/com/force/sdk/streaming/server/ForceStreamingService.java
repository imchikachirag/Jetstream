package com.force.sdk.streaming.server;

import com.force.sdk.streaming.client.ForceBayeuxClient;
import com.force.sdk.streaming.client.ForceStreamingClientModule;
import com.force.sdk.streaming.client.PushTopicManager;
import com.force.sdk.streaming.model.PushTopic;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.cometd.bayeux.Message;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.bayeux.server.BayeuxServer;
import org.cometd.bayeux.server.ServerSession;
import org.cometd.server.AbstractService;

import java.util.Map;

/**
 * @author naamannewbold
 */
public class ForceStreamingService extends AbstractService {

    Injector injector = Guice.createInjector(new ForceStreamingClientModule("forceDatabase", 120000));
    ForceBayeuxClient client;

    public ForceStreamingService(BayeuxServer bayeux) {
        super(bayeux, "ForceStreamingService");
        client = injector.getInstance(ForceBayeuxClient.class);
        addService("/service/force", "processForce");
    }

    public void processForce(final ServerSession remote, final Message message) throws InterruptedException {
        Map<String, Object> input = message.getDataAsMap();
        String name = (String)input.get("name");

        PushTopic topic = injector.getInstance(PushTopicManager.class).getTopicByName(name);
        client.handshake();
        client.subscribeTo(topic, new ClientSessionChannel.MessageListener() {
            public void onMessage(ClientSessionChannel channel, Message message) {
                remote.deliver(getServerSession(), "/force", message, null);
            }
        });
    }

}
