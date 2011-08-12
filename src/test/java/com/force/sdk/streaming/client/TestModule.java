package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceServiceConnector;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
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
}
