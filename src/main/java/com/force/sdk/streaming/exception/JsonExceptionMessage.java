package com.force.sdk.streaming.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @author naamannewbold
 */
public enum JsonExceptionMessage implements ExceptionMessageProvider {
    MISSING_COMMAND {
//        @Override
        public Map<String, Object> message() {
            Map<String, Object> message = new HashMap<String, Object>();
            message.put("code", name());
            message.put("message", "No command was provided for this operation.");
            return message;
        }
    }
}
