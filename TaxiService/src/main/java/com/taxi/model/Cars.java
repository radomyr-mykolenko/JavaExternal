package com.taxi.model;

public class Cars {
    private Short id;
    private Short car_type_id;
    private String car_number;
    private String car_brand;
    private Boolean ordered;

    public Cars(Short id, Short car_type_id, String car_number, String car_brand, Boolean ordered) {
        this.id = id;
        this.car_type_id = car_type_id;
        this.car_number = car_number;
        this.car_brand = car_brand;
        this.ordered = ordered;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getCar_type_id() {
        return car_type_id;
    }

    public void setCar_type_id(Short car_type_id) {
        this.car_type_id = car_type_id;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public Boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(Boolean ordered) {
        this.ordered = ordered;
    }
}
