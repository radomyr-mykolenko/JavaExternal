package com.company;

public enum ShipCapacity {
    TANKER("Tanker", 20), MIDDLE("Middle", 10), BOAT("Boat", 5);
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
