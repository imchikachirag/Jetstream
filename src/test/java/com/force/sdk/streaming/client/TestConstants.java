package com.force.sdk.streaming.client;

public enum TestConstants {
    CONNECTION_NAME("forceDatabase"),
    PERSISTENCE_UNIT("forceDatabase"),
    FORCE_DATABASE_URL(System.getenv("FORCE_FORCEDATABASE_URL"));

    private String value;

    TestConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}