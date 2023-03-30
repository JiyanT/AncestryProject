package com.ancestry.gatest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestHelper {
    public static void validateProbability(String expectedJsonPath, String actualJsonPath) throws IOException {
        String expectedJsonBytes = new String(Files.readAllBytes(Paths.get(expectedJsonPath)));
        String actualJsonBytes = new String(Files.readAllBytes(Paths.get(actualJsonPath)));

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode expectedJson = objectMapper.readTree(expectedJsonBytes);
        JsonNode actualJson = objectMapper.readTree(actualJsonBytes);

        double expectedProb = expectedJson.get("input_article_019.txt").get(0).asDouble();
        double actualProb = Double.parseDouble(actualJson.get("Responses").get(0)
                .get("Payload").get("Probability").asText());

        double diff = Math.abs(expectedProb - actualProb);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(diff,0.01,"Test failed: Difference in probability is greater than 0.01");
    }
}
