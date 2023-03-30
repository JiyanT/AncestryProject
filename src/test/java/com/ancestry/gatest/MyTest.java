package com.ancestry.gatest;

import org.testng.annotations.Test;

import java.io.IOException;

public class MyTest {

    @Test
    public void testProbability() throws IOException {
        String expectedJsonPath = "src/test/resources/expected_values.json";
        String actualJsonPath = "src/test/resources/actual_response.json";

        TestHelper.validateProbability(expectedJsonPath, actualJsonPath);
    }
}
