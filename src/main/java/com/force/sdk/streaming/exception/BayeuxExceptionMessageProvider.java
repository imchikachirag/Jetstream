package com.force.sdk.streaming.exception;

import java.util.Map;

/**
 * @author naamannewbold
 */
public interface BayeuxExceptionMessageProvider {
    Map<String, Object> message();
}
