package com.force.sdk.streaming.client;

import com.force.sdk.streaming.exception.ForceStreamingException;
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

    public PushTopic getTopicByName(String name) throws ForceStreamingException {
        List<PushTopic> pushTopics = em.createQuery("Select pt From PushTopic as pt Where pt.name = :pushTopicName", PushTopic.class)
                .setParameter("pushTopicName", name)
                .getResultList();

        if (pushTopics.size() == 0)
            throw new ForceStreamingException("Unable to find push topic named " + name);

        return pushTopics.get(0);
    }

    public PushTopic getTopicById(String pushTopicId) {
        return em.find(PushTopic.class, pushTopicId);
    }

    public PushTopic createPushTopic(PushTopic pt) {
        PushTopic pushTopic = new PushTopic(pt.getName(), pt.getApiVersion(), pt.getQuery(), pt.getDescription());
        em.getTransaction().begin();
        em.persist(pushTopic);
        em.getTransaction().commit();
        return pushTopic;
    }

    public PushTopic updatePushTopic(String pushTopicId, PushTopic pt) {
        PushTopic pushTopic = em.find(PushTopic.class, pushTopicId);
        copyStandardValues(pt, pushTopic);
        em.getTransaction().begin();
        em.merge(pushTopic);
        em.getTransaction().commit();
        return pushTopic;
    }

    private void copyStandardValues(PushTopic pt, PushTopic pushTopic) {
        pushTopic.setName(getIfNonNull(pt.getName(), pushTopic.getName()));
        pushTopic.setApiVersion(getIfNonNull(pt.getApiVersion(), pushTopic.getApiVersion()));
        pushTopic.setQuery(getIfNonNull(pt.getQuery(), pushTopic.getQuery()));
        pushTopic.setDescription(getIfNonNull(pt.getDescription(), pushTopic.getDescription()));
    }

    private <T> T getIfNonNull(T val, T defaultVal) {
        return (val != null) ? val : defaultVal;
    }

    public void delete(String pushTopicId) {
        PushTopic pushTopic = em.find(PushTopic.class, pushTopicId);
        em.getTransaction().begin();
        em.remove(pushTopic);
        em.getTransaction().commit();
    }
}
