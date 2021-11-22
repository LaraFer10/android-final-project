package br.ucsal.finderapp.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String code;
    private String service;
    private int quantity;
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
