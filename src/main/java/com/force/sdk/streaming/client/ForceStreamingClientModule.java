package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceConnectionProperty;
import com.force.sdk.connector.ForceConnectorUtils;
import com.force.sdk.connector.ForceServiceConnector;
import com.force.sdk.streaming.client.util.ForceStreamingResource;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.cometd.client.BayeuxClient;
import org.cometd.client.transport.ClientTransport;
import org.cometd.client.transport.LongPollingTransport;
import org.eclipse.jetty.client.HttpClient;

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

    public ForceStreamingClientModule() {
        this(Defaults.CONNECTION_NAME.getValue(), Integer.valueOf(Defaults.TIMEOUT.getValue()));
    }

    public ForceStreamingClientModule(String connectionName, int timeoutOption) {
        this.connectionName = connectionName;
        this.persistenceUnit = connectionName;
        this.timeoutOption = timeoutOption;
    }

    @Override
    protected void configure() {

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

    @Provides
    BayeuxClient provideBayeuxClient() throws Exception {
        String baseUrl = "http://" + ForceConnectorUtils.loadConnectorPropsFromName(connectionName).get(ForceConnectionProperty.ENDPOINT);
        baseUrl += ForceStreamingResource.RESOURCE_ENDPOINT.getValue();

        HttpClient client = new HttpClient();
        client.setConnectorType(HttpClient.CONNECTOR_SELECT_CHANNEL);
        client.setConnectTimeout(timeoutOption);
        client.setTimeout(timeoutOption);

        client.start();

        Map<String, Object> clientOptions = new HashMap<String, Object>();
        clientOptions.put(ClientTransport.TIMEOUT_OPTION, timeoutOption);

        return new BayeuxClient(baseUrl, LongPollingTransport.create(clientOptions, client));
    }
}
