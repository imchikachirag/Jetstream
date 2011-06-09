package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceConnectorConfig;
import com.force.sdk.connector.ForceServiceConnector;
import com.sforce.soap.partner.sobject.SObject;
import org.cometd.bayeux.Message;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.client.BayeuxClient;
import org.cometd.client.transport.ClientTransport;
import org.cometd.client.transport.LongPollingTransport;
import org.eclipse.jetty.client.HttpClient;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: naamannewbold
 * Date: 6/8/11
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class StreamingClient {

    private static final String pushTopicName = System.getProperty("sfdc.topicName", "defaultTopic");
    private static final String pushTopicQuery = System.getProperty("sfdc.query", "Select Id From Account");
    private static final String baseUrl = System.getProperty("sfdc.baseUrl", "http://vmf01.t.salesforce.com/cometd");

    public static void main(String[] args) throws Exception {
        ForceConnectorConfig config = new ForceConnectorConfig();
        config.setConnectionUrl(System.getProperty("FORCE_FORCEDATABASE_URL"));
        ForceServiceConnector connector = new ForceServiceConnector(config);

        SObject pushTopic = new SObject();
        pushTopic.setType("PushTopic");
        pushTopic.setField("name", pushTopicName);
        pushTopic.setField("query", pushTopicQuery);
        pushTopic.setField("apiVersion", "22.0");

        connector.getConnection().upsert("id", new SObject[]{pushTopic});

        HttpClient client = new HttpClient();
        client.setConnectorType(HttpClient.CONNECTOR_SELECT_CHANNEL);
        client.setConnectTimeout(120000);
        client.setTimeout(120000);

        client.start();

        Map<String, Object> clientOptions = new HashMap<String, Object>();
        clientOptions.put(ClientTransport.TIMEOUT_OPTION, 120000);
        BayeuxClient bayeuxClient = new BayeuxClient(baseUrl, new LongPollingTransport(clientOptions, client));
        bayeuxClient.setCookie("sid", connector.getConnection().getSessionHeader().getSessionId());
        bayeuxClient.handshake();

        while (!bayeuxClient.isHandshook()) {
            System.out.println("Waiting for handshake");
            Thread.sleep(5000);
        }

        bayeuxClient.getChannel("/" + pushTopicName).subscribe(new ClientSessionChannel.MessageListener() {
            public void onMessage(ClientSessionChannel clientSessionChannel, Message message) {
                System.out.println("=> Receiving streaming data...");
                System.out.println(message);
                System.out.println("=> Finished receiving data");
            }
        });

        System.in.read();
    }

}
