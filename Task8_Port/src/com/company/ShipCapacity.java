package com.company;

public enum ShipCapacity {
    TANKER("Tanker", 30), MIDDLE("Middle", 20), BOAT("Boat", 10);
    private int capacity;
    private String name;

    ShipCapacity(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
