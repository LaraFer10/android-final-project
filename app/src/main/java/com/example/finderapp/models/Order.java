package com.example.finderapp.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    @JsonProperty("codigo")
    private String code;

    @JsonProperty("servico")
    private String service;

    @JsonProperty("quantidade")
    private int quantity;

    @JsonProperty("eventos")
    private List<Event> events;

    public Order() {
        this.events = new ArrayList<>();
    }

    public Order(String code, String service, int quantity, List<Event> events) {
        this.setCode(code);
        this.setService(service);
        this.setQuantity(quantity);
        this.setEvents(events);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
