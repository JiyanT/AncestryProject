package com.ancestry.gatest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PayloadData {
    @JsonProperty("PageId")
    private int pageId;

    @JsonProperty("SegmentId")
    private String segmentId;

    @JsonProperty("ObitText")
    private String obitText;

    @JsonProperty("PageStateId")
    private int pageStateId;

    public PayloadData(int pageId, String segmentId, String obitText, int pageStateId) {
        this.pageId = pageId;
        this.segmentId = segmentId;
        this.obitText = obitText;
        this.pageStateId = pageStateId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public String getObitText() {
        return obitText;
    }

    public void setObitText(String obitText) {
        this.obitText = obitText;
    }

    public int getPageStateId() {
        return pageStateId;
    }

    public void setPageStateId(int pageStateId) {
        this.pageStateId = pageStateId;
    }
}
