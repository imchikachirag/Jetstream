package com.force.sdk.streaming.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @author naamannewbold
 */
public enum BayeuxExceptionMessage implements BayeuxExceptionMessageProvider {
    INVALID_PUSH_TOPIC_NAME {
        public Map<String, Object> message() {
            Map<String, Object> message = new HashMap<String, Object>();
            message.put("code", name());
            message.put("message", "Unable to find push topic.");
            return message;
        }
    }
}
