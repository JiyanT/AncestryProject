package com.ancestry.gatest;

import com.ancestry.gatest.pojo.Payload;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class PayloadBuilder {
    public static JsonNode buildPayload(Payload payload) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readTree(objectMapper.writeValueAsString(payload));
    }
}
