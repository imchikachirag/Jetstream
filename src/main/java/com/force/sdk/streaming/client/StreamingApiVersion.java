package com.force.sdk.streaming.client;

/**
 * @author naamannewbold
 */
public enum StreamingApiVersion {
    V20 (20.0),
    V21 (21.0),
    V22 (22.0),
    LATEST (V22.version);

    public double version;

    StreamingApiVersion(double version) {
        this.version = version;
    }
}
