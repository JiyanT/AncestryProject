package com.ancestry.gatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Payload {
    @JsonProperty("Meta")
    private Meta meta;

    @JsonProperty("Responses")
    private List<Responses> responses;

    public Payload(Meta meta, List<Responses> responses) {
        this.meta = meta;
        this.responses = responses;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Responses> getRequests() {
        return responses;
    }

    public void setRequests(List<Responses> responses) {
        this.responses = responses;
    }
}

