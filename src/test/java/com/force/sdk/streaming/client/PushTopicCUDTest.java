package com.force.sdk.streaming.client;

import com.force.sdk.streaming.model.PushTopic;
import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;

/**
 * Basic sanity test to ensure JPA integration is working correctly.
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

    @BeforeMethod
    public void clearEntityManager() {
        em.clear();
    }

    @Test(groups = "integration")
    public void testCreatePushTopic() {
        PushTopic pushTopic = newPushTopic("testCreatePushTopic");
        testUtil.insert(pushTopic);

        Assert.assertTrue(pushTopic.getId().length() >= 15, "Expected a force.com Id of length 15 or more, but the id was " + pushTopic.getId());
        Assert.assertEquals(em.find(PushTopic.class, pushTopic.getId()).getName(), "testCreatePushTopic");
    }

    @Test(groups = "integration")
    public void testUpdatePushTopic() {
        PushTopic pushTopic = newPushTopic("testUpdatePushTopic");
        testUtil.insert(pushTopic);
        pushTopic.setQuery("Select Id From Contact");
        testUtil.update(pushTopic);

        Assert.assertEquals(em.find(PushTopic.class, pushTopic.getId()).getQuery(), "Select Id From Contact");
    }

    @Test(groups = "integration")
    public void testDeletePushTopic() {
        PushTopic pushTopic = newPushTopic("testDeletePushTopic");
        testUtil.insert(pushTopic);
        String testTopicId = pushTopic.getId();
        testUtil.delete(pushTopic);

        Assert.assertEquals(em.find(PushTopic.class, testTopicId), null);
    }

    private PushTopic newPushTopic(String topicName) {
        PushTopic pushTopic = new PushTopic();
        pushTopic.setApiVersion(StreamingApiVersion.LATEST.version);
        pushTopic.setName(topicName);
        pushTopic.setQuery("Select Id From Account");
        return pushTopic;
    }
}
