package com.ancestry.gatest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
    @JsonProperty("RequestId")
    private String requestId;

    @JsonProperty("Pipeline")
    private String pipeline;

    @JsonProperty("PayloadSchemaVersion")
    private String payloadSchemaVersion;

    @JsonProperty("Payload")
    private PayloadData payloadData;

    public Request(String requestId, String pipeline, String payloadSchemaVersion, PayloadData payloadData) {
        this.requestId = requestId;
        this.pipeline = pipeline;
        this.payloadSchemaVersion = payloadSchemaVersion;
        this.payloadData = payloadData;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getPipeline() {
        return pipeline;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public String getPayloadSchemaVersion() {
        return payloadSchemaVersion;
    }

    public void setPayloadSchemaVersion(String payloadSchemaVersion) {
        this.payloadSchemaVersion = payloadSchemaVersion;
    }

    public PayloadData getPayloadData() {
        return payloadData;
    }

    public void setPayloadData(PayloadData payloadData) {
        this.payloadData = payloadData;
    }
}
