package com.force.sdk.streaming.client;

import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

/**
 * @author naamannewbold
 */
@Guice(modules = TestModule.class)
public class ForceBayeuxClientTest {

    @Inject ForceBayeuxClient client;

    @Test
    public void testForceBayeuxHandshake() throws InterruptedException {
        client.handshake();
        Assert.assertEquals(client.bayeuxClient.isHandshook(), true);
    }
}
