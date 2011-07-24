package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceConnectionProperty;
import com.force.sdk.connector.ForceConnectorUtils;
import com.force.sdk.connector.ForceServiceConnector;
import com.force.sdk.streaming.exception.ForceStreamingException;
import com.force.sdk.streaming.util.ForceStreamingResource;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.cometd.client.BayeuxClient;
import org.cometd.client.transport.ClientTransport;
import org.cometd.client.transport.LongPollingTransport;
import org.eclipse.jetty.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author naamannewbold
 */
public class ForceStreamingClientModule extends AbstractModule {

    String connectionName;
    String persistenceUnit;
    int timeoutOption;

    private static final Logger LOGGER = LoggerFactory.getLogger(ForceStreamingClientModule.class);

    public ForceStreamingClientModule() {
        this(Defaults.CONNECTION_NAME.getValue(), Integer.valueOf(Defaults.TIMEOUT.getValue()));
    }

    public ForceStreamingClientModule(String connectionName, int timeoutOption) {
        this(connectionName, Defaults.PERSISTENCE_UNIT.getValue(), timeoutOption);
    }

    public ForceStreamingClientModule(String connectionName, String persistenceUnitName, int timeoutOption) {
        this.connectionName = connectionName;
        this.persistenceUnit = persistenceUnitName;
        this.timeoutOption = timeoutOption;
    }

    @Override
    protected void configure() {
        bind(PushTopicManager.class);
    }

    @Provides
    EntityManager provideEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnit);
        return emf.createEntityManager();
    }

    @Provides
    ForceServiceConnector provideConnector() throws IOException {
        return new ForceServiceConnector(connectionName);
    }

    // TODO: client.start() could potentially have some side effects.
    // Need to understand more of what's going on under the hood.
    @Provides
    BayeuxClient provideBayeuxClient() throws Exception {
        LOGGER.info("Providing bayeux client for connection name", connectionName);

        Map<ForceConnectionProperty, String> connectionProperties = ForceConnectorUtils.loadConnectorPropsFromName(connectionName);
        if (connectionProperties == null || !connectionProperties.containsKey(ForceConnectionProperty.ENDPOINT))
            throw new ForceStreamingException("Unable to find connection named " + connectionName);

        String baseUrl = "http://" + connectionProperties.get(ForceConnectionProperty.ENDPOINT);
        baseUrl += ForceStreamingResource.RESOURCE_ENDPOINT.getValue();

        HttpClient client = new HttpClient();
        client.setConnectorType(HttpClient.CONNECTOR_SELECT_CHANNEL);
        client.setConnectTimeout(timeoutOption);
        client.setTimeout(timeoutOption);

        LOGGER.debug("Starting HttpClient", client);
        client.start();

        Map<String, Object> clientOptions = new HashMap<String, Object>();
        clientOptions.put(ClientTransport.TIMEOUT_OPTION, timeoutOption);

        return new BayeuxClient(baseUrl, LongPollingTransport.create(clientOptions, client));
    }
}
