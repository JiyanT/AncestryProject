package com.ancestry.gatest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
    @JsonProperty("RequestorId")
    private String requestorId;

    @JsonProperty("EnvelopeSchemaVersion")
    private String envelopeSchemaVersion;

    public Meta(String requestorId, String envelopeSchemaVersion) {
        this.requestorId = requestorId;
        this.envelopeSchemaVersion = envelopeSchemaVersion;
    }

    public String getRequestorId() {
        return requestorId;
    }

    public void setRequestorId(String requestorId) {
        this.requestorId = requestorId;
    }

    public String getEnvelopeSchemaVersion() {
        return envelopeSchemaVersion;
    }

    public void setEnvelopeSchemaVersion(String envelopeSchemaVersion) {
        this.envelopeSchemaVersion = envelopeSchemaVersion;
    }
}
