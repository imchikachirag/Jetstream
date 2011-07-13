package com.force.sdk.streaming.server;

import com.force.sdk.streaming.client.Defaults;
import com.force.sdk.streaming.client.ForceBayeuxClient;
import com.force.sdk.streaming.client.ForceStreamingClientModule;
import com.force.sdk.streaming.client.PushTopicManager;
import com.force.sdk.streaming.exception.BayeuxExceptionMessage;
import com.force.sdk.streaming.exception.ForceStreamingException;
import com.force.sdk.streaming.model.PushTopic;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.cometd.bayeux.Message;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.bayeux.server.BayeuxServer;
import org.cometd.bayeux.server.ServerSession;
import org.cometd.server.AbstractService;

import javax.servlet.ServletConfig;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author naamannewbold
 */
// TODO: use annotations instead of extending
// http://cometd.org/documentation/2.x/cometd-java/server/services/annotated
public class ForceStreamingService extends AbstractService {

    Injector injector;
    ForceBayeuxClient client;
    private Map<String, String> config = new HashMap<String, String>();

    public ForceStreamingService(BayeuxServer bayeux, ServletConfig servletConfig) {
        super(bayeux, "ForceStreamingService");

        initConfig(servletConfig);
        injector = Guice.createInjector(new ForceStreamingClientModule(
                config.get(Defaults.CONNECTION_NAME.name())
              , config.get(Defaults.PERSISTENCE_UNIT.name())
              , Integer.valueOf(config.get(Defaults.TIMEOUT.name()))));
        client = injector.getInstance(ForceBayeuxClient.class);
        addService("/service/force", "processForce");
    }

    private void initConfig(ServletConfig servletConfig) {
        Enumeration<String> configParams = servletConfig.getInitParameterNames();

        while (configParams.hasMoreElements()) {
            String param = configParams.nextElement();
            config.put(param, servletConfig.getInitParameter(param));
        }

        if (!config.containsKey(Defaults.CONNECTION_NAME.name()))
            config.put(Defaults.CONNECTION_NAME.name(), Defaults.CONNECTION_NAME.getValue());
        if (!config.containsKey(Defaults.PERSISTENCE_UNIT.name()))
            config.put(Defaults.PERSISTENCE_UNIT.name(), Defaults.PERSISTENCE_UNIT.getValue());
        if (!config.containsKey(Defaults.TIMEOUT.name()))
            config.put(Defaults.TIMEOUT.name(), Defaults.TIMEOUT.getValue());
    }

    public void processForce(final ServerSession remote, final Message message) throws InterruptedException {
        Map<String, Object> input = message.getDataAsMap();
        String name = (String)input.get("name");

        try {
            PushTopic topic = injector.getInstance(PushTopicManager.class).getTopicByName(name);
            client.handshake();
            client.subscribeTo(topic, new ClientSessionChannel.MessageListener() {
                public void onMessage(ClientSessionChannel channel, Message message) {
                    remote.deliver(getServerSession(), "/force", message, null);
                }
            });
        } catch (ForceStreamingException e) {
            remote.deliver(getServerSession(), "/force", BayeuxExceptionMessage.INVALID_PUSH_TOPIC_NAME.message(), null);
        }
    }

}
