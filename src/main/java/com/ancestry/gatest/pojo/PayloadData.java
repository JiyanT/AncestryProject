package com.ancestry.gatest.pojo;

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

    @JsonProperty("Probability")
    private String probability;

    @JsonProperty("IsObit")
    private boolean isObit;

    @JsonProperty("Threshold")
    private double threshold;

    public PayloadData(int pageId, String segmentId, String obitText, int pageStateId, String probability, boolean isObit, double threshold) {
        this.pageId = pageId;
        this.segmentId = segmentId;
        this.obitText = obitText;
        this.pageStateId = pageStateId;
        this.probability = probability;
        this.isObit = isObit;
        this.threshold = threshold;
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

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }

    public boolean isObit() {
        return isObit;
    }

    public void setObit(boolean obit) {
        isObit = obit;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
}
