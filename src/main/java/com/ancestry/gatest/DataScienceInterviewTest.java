package com.ancestry.gatest;

import com.ancestry.gatest.pojo.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataScienceInterviewTest {
    @Test
    public void testJsonSerialization() throws IOException {
        String obitText = getResourceFileAsString();

        Meta meta = new Meta("newspaper","5.0.1","2019-02-06T23:48:12.461074Z","2019_02_06_23_48_1549496892-818501403622");
        PayloadData payloadData = new PayloadData(5455546,"9d2d01f0-a8a9-4089-8d12-37ddfe4cd940",obitText,2,"7.60928e-05",false,0.5);
        Status status = new Status(200,"Success");

        Responses responses=new Responses("1604415e-a84c-4784-8434-6e9844568217","article-obit-or-not","3.0.1", payloadData, status,"1.0.0");
        List<Responses> listResponse = new ArrayList<>();
        listResponse.add(responses);

        Payload payload = new Payload(meta, listResponse);
        System.out.println(PayloadBuilder.buildPayload(payload).toPrettyString());
    }

    private String getResourceFileAsString() throws IOException {
        String inputText = new String(Files.readAllBytes(Paths.get("src/main/resources/input_article_019.txt")));
        return inputText;
    }
}
