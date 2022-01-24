package com.cur.garbageClassification.entity;

import java.io.Serializable;

public class GcDetailDict implements Serializable {

    private String gcId;
    private String gcName;

    public GcDetailDict(String gcId, String gcName) {
        this.gcId = gcId;
        this.gcName = gcName;
    }

    public String getGcId() {
        return gcId;
    }

    public void setGcId(String gcId) {
        this.gcId = gcId;
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName;
    }

    @Override
    public String toString() {
        return "GcDetailDict{" +
                "gcId='" + gcId + '\'' +
                ", gcName='" + gcName + '\'' +
                '}';
    }
}
