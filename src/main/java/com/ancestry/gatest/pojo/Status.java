package com.ancestry.gatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    @JsonProperty("PageId")
    private int code;

    @JsonProperty("SegmentId")
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Status(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
