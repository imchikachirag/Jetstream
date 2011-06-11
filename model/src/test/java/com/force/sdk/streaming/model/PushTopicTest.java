package com.force.sdk.streaming.model;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * @author naamannewbold
 */
public class PushTopicTest {

    EntityManager em = Persistence.createEntityManagerFactory("forceDatabase").createEntityManager();

    @BeforeClass
    public void clearPushTopics() {
        em.createQuery("Delete From PushTopic").executeUpdate();
    }

    @Test
    public void testCreatePushTopic() {
        PushTopic pushTopic = new PushTopic();
        pushTopic.setApiVersion(22.0);
        pushTopic.setName("testTopic");
        pushTopic.setQuery("Select Id From Account");
        em.getTransaction().begin();
        em.persist(pushTopic);
        em.getTransaction().commit();

        Assert.assertTrue(pushTopic.getId().length() >= 15, "Expected a force.com Id of length 15 or more, but the id was " + pushTopic.getId());
        Assert.assertEquals(em.find(PushTopic.class, pushTopic.getId()).getName(), "testTopic");
    }
}
