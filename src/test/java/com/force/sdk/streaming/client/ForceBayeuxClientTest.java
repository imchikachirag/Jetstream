package com.force.sdk.streaming.client;

import com.force.sdk.streaming.model.PushTopic;
import com.force.sdk.streaming.model.StreamingEntity;
import com.google.inject.Inject;
import org.cometd.bayeux.Channel;
import org.cometd.bayeux.Message;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.client.BayeuxClient;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.HashMap;
import java.util.Map;

/**
 * @author naamannewbold
 */
@Guice(modules = TestModule.class)
public class ForceBayeuxClientTest {

    @Inject ForceBayeuxClient client;
    @Inject PushTopic pushTopic;
    @Inject EntityManager em;

    @AfterClass
    public void deleteTestPushTopic() {
        Assert.assertNotNull(pushTopic.getId());
        em.createQuery("Delete From PushTopic o Where o.id = :pushTopicId")
                .setParameter("pushTopicId", pushTopic.getId())
                .executeUpdate();
    }

    @Test
    public void testForceBayeuxHandshake() throws InterruptedException {
        client.handshake();
        Assert.assertEquals(client.bayeuxClient.isHandshook(), true);
    }

    @Test
    public void testChannelMessage() throws InterruptedException {

        final StreamingEntity streamingEntity = new StreamingEntity();
        streamingEntity.setName("A" + System.currentTimeMillis());

        client.bayeuxClient.getChannel(Channel.META_HANDSHAKE).addListener(new ClientSessionChannel.MessageListener() {
            @Override
            public void onMessage(ClientSessionChannel sessionChannel, Message message) {
                if (message.isSuccessful()) {
                    System.out.println(message.getJSON());
                    EntityTransaction tx = em.getTransaction();
                    tx.begin();
                    em.persist(streamingEntity);
                    tx.commit();
                    System.out.println("PushTopic Query: " + pushTopic);
                    System.out.println("StreamingEntity Id: " + streamingEntity.getId());
                }
            }
        });

        client.subscribeTo(pushTopic, new ClientSessionChannel.MessageListener() {
            @Override
            public void onMessage(ClientSessionChannel sessionChannel, Message message) {
                System.out.println(message.getJSON());

                Map<String,Object> result = message.getDataAsMap();

//                new Gson().
                Assert.assertTrue(result.containsKey("sobject"), "Expected a top level 'sobject' JSON element, but it is not present in " + message.getJSON());
                Assert.assertTrue(result.containsKey("event"), "Expected a top level 'event' JSON element, but it is not present in " + message.getJSON());
                Assert.assertTrue(((HashMap<String, Object>)result.get("sobject")).containsKey("Name"), "Expected sobject.Name, but it is not present in " + message.getJSON());
//                Assert.assertTrue(result.get("data"), "Expected a top level 'data' JSON element, but it is not present.");
//                sessionChannel.getSession().disconnect();
            }
        });

        client.bayeuxClient.waitFor(10000, BayeuxClient.State.DISCONNECTED);
        if (streamingEntity.getId() != null) {
            em.createQuery("Delete From StreamingEntity o Where o.id = :id")
                    .setParameter("id", streamingEntity.getId())
                    .executeUpdate();
        }
    }
}
