package com.force.sdk.streaming.exception;

import java.util.Map;

/**
 * @author naamannewbold
 */
public interface ExceptionMessageProvider {
    public Map<String, Object> message();
}
