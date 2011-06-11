package com.force.sdk.streaming.client.util;

/**
 * Created by IntelliJ IDEA.
 * User: naamannewbold
 * Date: 6/9/11
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public enum ForceStreamingResource {
    CHANNEL_PREFIX ("/")
  , RESOURCE_ENDPOINT ("/cometd");

    private String value;

    ForceStreamingResource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
