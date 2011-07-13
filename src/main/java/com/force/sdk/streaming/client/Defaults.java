package com.force.sdk.streaming.client;

/**
 * @author naamannewbold
 */
public enum Defaults {
    CONNECTION_NAME ("forceDatabase"),
    PERSISTENCE_UNIT ("forceDatabase"),
    TIMEOUT ("120000");

    private String value;

    Defaults(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
