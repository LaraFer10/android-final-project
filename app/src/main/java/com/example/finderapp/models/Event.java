package com.example.finderapp.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Event {
    @JsonProperty("data")
    private String date;

    @JsonProperty("hora")
    private String hour;

    @JsonProperty("local")
    private String local;

    @JsonProperty("status")
    private String status;

    @JsonProperty("subStatus")
    private List<String> subStatus;

    public Event() {
        this.subStatus = new ArrayList<>();
    }

    public Event(String date, String hour, String local, String status, List<String> subStatus) {
        this.setDate(date);
        this.setHour(hour);
        this.setLocal(local);
        this.setStatus(status);
        this.setSubStatus(subStatus);
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(List<String> subStatus) {
        this.subStatus = subStatus;
    }
}
