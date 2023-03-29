package com.ancestry.gatest;

import com.ancestry.gatest.Meta;
import com.ancestry.gatest.Payload;
import com.ancestry.gatest.PayloadData;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PayloadBuilder {
    public static Payload buildPayload(String obitText) {
        Meta meta = new Meta("requestorId", "1.0.0");

        List<Request> requests = new ArrayList<>();
        requests.add(new Request(
                UUID.randomUUID().toString(),
                "article-obit-or-not",
                "3.0.1",
                new PayloadData(
                        5455546,
                        UUID.randomUUID().toString(),
                        obitText,
                        2
                )
        ));

        return new Payload(meta, requests);
    }
}
