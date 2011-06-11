package com.force.sdk.streaming.client.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * @author naamannewbold
 */
public class ForceStreamingUtilTest {
    @Test
    public void testParseBaseUrl() throws MalformedURLException {
        String baseUrl = ForceStreamingUtil.parseBaseUrl("https://na1-api.salesforce.com/services/soap/");
        Assert.assertEquals(baseUrl, "https://na1-api.salesforce.com");
    }

    @Test
    public void testParseBaseUrlWithDuplicateProtocols() throws MalformedURLException {
        String baseUrl = ForceStreamingUtil.parseBaseUrl("https://na1-api.salesforce.com/services/soap/?http://www.salesforce.com");
        Assert.assertEquals(baseUrl, "https://na1-api.salesforce.com");
    }

    @Test(expectedExceptions = MalformedURLException.class)
    public void testParseBaseUrlWithNoProtocol() throws MalformedURLException {
        String baseUrl = ForceStreamingUtil.parseBaseUrl("na1-api.salesforce.com/services/soap");
    }

    @Test(expectedExceptions = MalformedURLException.class)
    public void testParseBaseUrlWithNull() throws MalformedURLException {
        String baseUrl = ForceStreamingUtil.parseBaseUrl(null);
    }
}
