package com.force.sdk.streaming.client;

import com.force.sdk.streaming.model.PushTopic;
import com.google.inject.Inject;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author naamannewbold
 */
public class PushTopicManager {

    @Inject
    EntityManager em;

    public List<PushTopic> getTopics() {
        return em.createQuery("Select o From PushTopic o", PushTopic.class).getResultList();
    }

    public PushTopic getTopicByName(String name) {
        List<PushTopic> pushTopics = em.createQuery("Select pt From PushTopic as pt Where pt.name = :pushTopicName", PushTopic.class)
                .setParameter("pushTopicName", name)
                .getResultList();
        System.out.println(pushTopics);
        return pushTopics.get(0);
    }
}
