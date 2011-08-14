package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceServiceConnector;
import com.force.sdk.streaming.model.PushTopic;
import com.google.inject.*;
import com.sforce.ws.ConnectionException;
import org.eclipse.jetty.client.HttpClient;

import javax.persistence.EntityManager;

/**
 * @author naamannewbold
 */
public class TestModule extends AbstractModule {

    Injector injector;

    public TestModule() {
        injector = Guice.createInjector(
            new ForceStreamingClientModule(
                    TestConstants.CONNECTION_NAME.getValue(), TestConstants.PERSISTENCE_UNIT.getValue(), 30000
            )
        );
    }

    @Override
    protected void configure() {
        bind(TestUtil.class);
        bind(PushTopicManager.class);
    }

    @Provides
    EntityManager provideEntityManager() {
        return injector.getInstance(EntityManager.class);
    }

    @Provides
    ForceServiceConnector provideConnector() throws ConnectionException {
        return injector.getInstance(ForceServiceConnector.class);
    }

    @Provides
    String provideBaseUrl() {
        return injector.getInstance(String.class);
    }

    @Provides
    HttpClient provideHttpClient() {
        return injector.getInstance(HttpClient.class);
    }

    @Provides
    @Inject
    PushTopic providePushTopic(EntityManager em) {
        PushTopic pushTopic = new PushTopic(
                "PT" + System.currentTimeMillis()
              , StreamingApiVersion.LATEST.version
              , "Select Id, Name From StreamingEntity__c"
              , "streamingtopic"
        );
        em.getTransaction().begin();
        em.persist(pushTopic);
        em.getTransaction().commit();
        return em.find(PushTopic.class, pushTopic.getId());
    }
}
