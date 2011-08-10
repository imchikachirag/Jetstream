package com.force.sdk.streaming.server;

import com.force.sdk.streaming.client.Defaults;
import com.force.sdk.streaming.client.ForceBayeuxClient;
import com.force.sdk.streaming.client.ForceStreamingClientModule;
import com.force.sdk.streaming.client.PushTopicManager;
import com.force.sdk.streaming.exception.BayeuxExceptionMessage;
import com.force.sdk.streaming.exception.ExceptionMessageProvider;
import com.force.sdk.streaming.exception.ForceStreamingException;
import com.force.sdk.streaming.model.PushTopic;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.cometd.bayeux.Message;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.bayeux.server.BayeuxServer;
import org.cometd.bayeux.server.ServerSession;
import org.cometd.server.AbstractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import java.util.Map;

/**
 * @author naamannewbold
 */
// TODO: use annotations instead of extending
// http://cometd.org/documentation/2.x/cometd-java/server/services/annotated
public class ForceStreamingService extends AbstractService {

    ForceBayeuxClient client;
    PushTopicManager pushTopicManager;

    private static final Logger LOGGER = LoggerFactory.getLogger(ForceStreamingService.class);

    public ForceStreamingService(BayeuxServer bayeuxServer, ServletConfig config) {
        super(bayeuxServer, "ForceStreamingService");
        LOGGER.info("Creating bayeux service at /service/force");
        Injector injector = Guice.createInjector(new ForceStreamingClientModule(
                getParam(config, Defaults.CONNECTION_NAME)
              , getParam(config, Defaults.PERSISTENCE_UNIT)
              , Integer.valueOf(getParam(config, Defaults.TIMEOUT))
        ));
        client = injector.getInstance(ForceBayeuxClient.class);
        pushTopicManager = injector.getInstance(PushTopicManager.class);
        addService("/service/force", "processForce");
    }

    private String getParam(ServletConfig config, Defaults defaults) {
        String param = config.getInitParameter(defaults.name());
        if (param == null)
            param = defaults.getValue();
        return param;
    }

    public void processForce(final ServerSession remote, final Message message) throws InterruptedException {
        Map<String, Object> input = message.getDataAsMap();
        String name = (String)input.get("name");

        try {
            validateName(name);
            LOGGER.info("Processing " + name + " topic");

            PushTopic topic = pushTopicManager.getTopicByName(name);
            client.subscribeTo(topic, new ClientSessionChannel.MessageListener() {
                public void onMessage(ClientSessionChannel channel, Message message) {
                    LOGGER.debug("Received message on " + channel.toString());
                    remote.deliver(getServerSession(), "/force", message, null);
                }
            });
        } catch (ForceStreamingException e) {
            LOGGER.debug("Invalid push topic, " + name);
            ExceptionMessageProvider invalidPushTopicError = BayeuxExceptionMessage.INVALID_PUSH_TOPIC_NAME;
            remote.deliver(getServerSession(), "/force", invalidPushTopicError.message(), null);
        }
    }

    private void validateName(String name) throws ForceStreamingException {
        if (name.matches("^\\w"))
            throw new ForceStreamingException("Invalid push topic name.");
    }

}
