package com.force.sdk.streaming.client;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Table;
import java.util.Set;

/**
 * @author naamannewbold
 */
public class TestUtil {

    @Inject
    EntityManager entityManager;


    public void clean(String table, Set<String> names) {
        entityManager.getTransaction().begin();

        // criteria builder doesn't support delete for some reason, so
        // doing a conditional parameter in this fugly way
        if (names == null)
            entityManager.createQuery("Delete From " + table).executeUpdate();
        else
            entityManager.createQuery("DELETE From " + table +  " Where Name In :names")
                .setParameter("names", names).executeUpdate();

        entityManager.getTransaction().commit();
    }

    public void clean(Class<?> classWithTableAnnotation, Set<String> names) {
        if (classWithTableAnnotation.isAnnotationPresent(Table.class)) {
            clean(classWithTableAnnotation.getAnnotation(Table.class).name(), names);
        } else {
            clean(classWithTableAnnotation.getCanonicalName(), names);
        }
    }

}
