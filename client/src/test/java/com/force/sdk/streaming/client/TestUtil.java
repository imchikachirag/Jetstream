package com.force.sdk.streaming.client;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Table;

/**
 * @author naamannewbold
 */
public class TestUtil {

    @Inject
    EntityManager entityManager;

    public void clean(String table) {
        entityManager.getTransaction().begin();
        entityManager.createQuery("DELETE From " + table).executeUpdate();
        entityManager.getTransaction().commit();
    }

    public void clean(Class<?> classWithTableAnnotation) {
        if (classWithTableAnnotation.isAnnotationPresent(Table.class)) {
            clean(classWithTableAnnotation.getAnnotation(Table.class).name());
        } else {
            clean(classWithTableAnnotation.getCanonicalName());
        }
        clean(classWithTableAnnotation.getAnnotation(Table.class).name());
    }
}
