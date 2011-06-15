package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceConnectorConfig;
import com.force.sdk.connector.ForceServiceConnector;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.sforce.ws.ConnectionException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author naamannewbold
 */
public class TestModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TestUtil.class);
    }

    @Provides
    EntityManager provideEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(TestConstants.PERSISTENCE_UNIT.getValue());
        return emf.createEntityManager();
    }

    @Provides
    ForceServiceConnector provideConnector() throws ConnectionException {
        ForceConnectorConfig config = new ForceConnectorConfig();
        config.setConnectionUrl(TestConstants.FORCE_DATABASE_URL.getValue());
        return new ForceServiceConnector(config);
    }
}
