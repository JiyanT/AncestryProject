package com.ancestry.gatest;

import com.ancestry.gatest.Payload;
import com.ancestry.gatest.PayloadBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class DataScienceInterviewTest {
    @Test
    public void testJsonSerialization() throws IOException {
        String obitText = getResourceFileAsString("input_article_019.txt");
        Payload payload = PayloadBuilder.buildPayload(obitText);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
        System.out.println(json);
    }

    private String getResourceFileAsString(String fileName) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
        return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    }
}
