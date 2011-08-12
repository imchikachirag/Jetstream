package com.force.sdk.streaming.util;

/**
 * @author naamannewbold
 */
public enum ForceStreamingResource {
    CHANNEL_PREFIX ("/topic/")
  , RESOURCE_ENDPOINT ("/cometd/23.0")
  , PROTOCOL ("https");

    private String value;

    ForceStreamingResource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
