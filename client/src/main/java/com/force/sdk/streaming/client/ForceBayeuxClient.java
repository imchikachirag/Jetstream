package com.force.sdk.streaming.client;

import com.force.sdk.connector.ForceConnectorConfig;
import com.force.sdk.connector.ForceServiceConnector;
import com.force.sdk.streaming.client.util.ForceStreamingUtil;
import com.sforce.ws.ConnectionException;
import org.cometd.client.BayeuxClient;

import java.net.MalformedURLException;

/**
 * @author naamannewbold
 */
public class ForceBayeuxClient {

    private ForceServiceConnector connector;

    private BayeuxClient bayeuxClient;

    public ForceBayeuxClient(ForceConnectorConfig config) throws ConnectionException, MalformedURLException {
        this(new ForceServiceConnector(config));
    }

    public ForceBayeuxClient(ForceServiceConnector connector) throws ConnectionException, MalformedURLException {
        this.connector = connector;

        String baseUrl = ForceStreamingUtil.parseBaseUrl(connector.getConnection().getConfig().getServiceEndpoint());

    }

    public BayeuxClient getBayeuxClient() {
        return bayeuxClient;
    }

    public void setBayeuxClient(BayeuxClient bayeuxClient) {
        this.bayeuxClient = bayeuxClient;
    }

}
