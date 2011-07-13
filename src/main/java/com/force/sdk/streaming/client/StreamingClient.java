package com.force.sdk.streaming.client;

import com.force.sdk.streaming.model.PushTopic;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.cometd.bayeux.Message;
import org.cometd.bayeux.client.ClientSessionChannel;

import javax.persistence.EntityManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author naamannewbold
 */
public class StreamingClient {

    public static void main(String[] args) throws Exception {
        System.out.println("blah");
        Injector injector = Guice.createInjector(new ForceStreamingClientModule());
        EntityManager em = injector.getInstance(EntityManager.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PushTopic pushTopic = new PushTopic();
        System.out.print("Enter a push topic name: ");
        pushTopic.setName(br.readLine());
        System.out.println("Enter a push topic query: ");
        String query = br.readLine();
        pushTopic.setQuery(query);
        pushTopic.setApiVersion(StreamingApiVersion.LATEST.version);

        em.getTransaction().begin();
        em.persist(pushTopic);
        em.getTransaction().commit();

        pushTopic = em.find(PushTopic.class, pushTopic.getId());

        ForceBayeuxClient forceBayeuxClient = injector.getInstance(ForceBayeuxClient.class);
//        forceBayeuxClient.setOutputStream(System.out);
        forceBayeuxClient.handshake();
        forceBayeuxClient.subscribeTo(pushTopic, new ClientSessionChannel.MessageListener() {
            public void onMessage(ClientSessionChannel clientSessionChannel, Message message) {
                System.out.println(message);
            }
        });
    }

}
