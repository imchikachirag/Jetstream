package com.force.sdk.streaming.client;

import com.force.sdk.streaming.model.PushTopic;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * @author naamannewbold
 */
public class TestContext {

    @Inject
    EntityManager entityManager;
    PushTopic pushTopic;

    public void clean(Class<?> cleanClass) {
//        entityManager.createQuery("DELETE From", cleanClass);
        EntityManager em = Persistence.createEntityManagerFactory("forceDatabase").createEntityManager();
        em.createQuery("DELETE From PushTopic").executeUpdate();
    }
}
