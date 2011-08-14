package com.force.sdk.streaming.client;

/**
 * @author naamannewbold
 */
public enum StreamingApiVersion {
    V22 (22.0),
    V23 (23.0),
    LATEST (V23.version);

    public double version;

    StreamingApiVersion(double version) {
        this.version = version;
    }
}
