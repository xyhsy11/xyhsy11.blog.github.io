package com.cur.garbageClassification.entity;

import java.util.List;

public class JsonBean {
    private String message;
    private int status;
    private List<GcDetailDict> data;

    public JsonBean(String message, int status, List<GcDetailDict> data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<GcDetailDict> getData() {
        return data;
    }

    public void setData(List<GcDetailDict> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }
}
