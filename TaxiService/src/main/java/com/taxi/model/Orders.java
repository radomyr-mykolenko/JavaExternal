package com.taxi.model;

public class Orders {
    private Short id;
    private Short user_id;
    private String start;
    private String destination;
    private Short distance;
    private Short cost;
    private Short car_id;

    public Orders(Short id, Short user_id, String start, String destination, Short distance, Short cost, Short car_id) {
        this.id = id;
        this.user_id = user_id;
        this.start = start;
        this.destination = destination;
        this.distance = distance;
        this.cost = cost;
        this.car_id = car_id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getUser_id() {
        return user_id;
    }

    public void setUser_id(Short user_id) {
        this.user_id = user_id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Short getDistance() {
        return distance;
    }

    public void setDistance(Short distance) {
        this.distance = distance;
    }

    public Short getCost() {
        return cost;
    }

    public void setCost(Short cost) {
        this.cost = cost;
    }

    public Short getCar_id() {
        return car_id;
    }

    public void setCar_id(Short car_id) {
        this.car_id = car_id;
    }
}
