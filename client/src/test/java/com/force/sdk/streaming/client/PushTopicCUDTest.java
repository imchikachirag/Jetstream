package com.force.sdk.streaming.client;

import com.force.sdk.streaming.model.PushTopic;
import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;

/**
 * @author naamannewbold
 */
@Guice(modules = TestModule.class)
public class PushTopicCUDTest {

    @Inject
    EntityManager em;

    @Inject
    TestUtil testUtil;

    @BeforeClass
    public void clearPushTopics() {
        testUtil.clean(PushTopic.class);
    }

    @Test
    public void testCreatePushTopic() {
        PushTopic pushTopic = new PushTopic();
        pushTopic.setApiVersion(StreamingApiVersion.LATEST.version);
        pushTopic.setName("testTopic");
        pushTopic.setQuery("Select Id From Account");
        em.getTransaction().begin();
        em.persist(pushTopic);
        em.getTransaction().commit();

        Assert.assertTrue(pushTopic.getId().length() >= 15, "Expected a force.com Id of length 15 or more, but the id was " + pushTopic.getId());
        Assert.assertEquals(em.find(PushTopic.class, pushTopic.getId()).getName(), "testTopic");
    }
}
