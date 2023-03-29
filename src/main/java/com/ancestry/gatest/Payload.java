package com.ancestry.gatest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Payload {
    @JsonProperty("Meta")
    private Meta meta;

    @JsonProperty("Requests")
    private List<Request> requests;

    public Payload(Meta meta, List<Request> requests) {
        this.meta = meta;
        this.requests = requests;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }
}

