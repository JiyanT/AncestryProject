package com.ancestry.gatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
    @JsonProperty("RequestorId")
    private String requestorId;
    @JsonProperty("EnvelopeSchemaVersion")
    private String envelopeSchemaVersion;
    @JsonProperty("SystemTime")
    private String systemTime;
    @JsonProperty("SystemId")
    private String systemId;

    public Meta(String requestorId, String envelopeSchemaVersion, String systemTime,String systemId ) {
        this.requestorId = requestorId;
        this.envelopeSchemaVersion = envelopeSchemaVersion;
        this.systemTime = systemTime;
        this.systemId = systemId;
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

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
