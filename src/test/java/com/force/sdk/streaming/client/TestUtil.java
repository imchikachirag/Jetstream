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

    public void insert(Object insertable) {
        entityManager.getTransaction().begin();
        entityManager.persist(insertable);
        entityManager.getTransaction().commit();
    }

    public void update(Object updateable) {
        entityManager.getTransaction().begin();
        entityManager.merge(updateable);
        entityManager.getTransaction().commit();
    }

    public void delete(Object deleteable) {
        entityManager.getTransaction().begin();
        entityManager.remove(deleteable);
        entityManager.getTransaction().commit();
    }

//    public void upsert(BaseForceObject upsertable) {
//        entityManager.getTransaction().begin();
//        if (upsertable.getId() != null) {
//            entityManager.merge(upsertable);
//        } else {
//            entityManager.persist(upsertable);
//        }
//        entityManager.getTransaction().commit();
//    }
}
