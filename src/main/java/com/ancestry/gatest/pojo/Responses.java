package com.ancestry.gatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Responses {
    @JsonProperty("RequestId")
    private String requestId;

    @JsonProperty("Pipeline")
    private String pipeline;

    @JsonProperty("PayloadSchemaVersion")
    private String payloadSchemaVersion;

    @JsonProperty("Payload")
    private PayloadData payloadData;

    @JsonProperty("Status")
    private Status status;

    @JsonProperty("PipelineRelease")
    private String pipelineRelease;

    public Responses(String requestId, String pipeline, String payloadSchemaVersion, PayloadData payloadData, Status status, String pipelineRelease) {
        this.requestId = requestId;
        this.pipeline = pipeline;
        this.payloadSchemaVersion = payloadSchemaVersion;
        this.payloadData = payloadData;
        this.status = status;
        this.pipelineRelease = pipelineRelease;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPipelineRelease() {
        return pipelineRelease;
    }

    public void setPipelineRelease(String pipelineRelease) {
        this.pipelineRelease = pipelineRelease;
    }
}
