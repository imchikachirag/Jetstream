package com.force.sdk.streaming.client.util;


import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author naamannewbold
 */
public class ForceStreamingUtil {

    public static String parseBaseUrl(String baseUrl) throws MalformedURLException {
        URL url = new URL(baseUrl);
        return url.getProtocol() + "://" + url.getHost() + (url.getPort() > 0 ? url.getPort() : "");
    }

}
