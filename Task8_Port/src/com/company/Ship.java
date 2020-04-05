package com.company;

import java.util.Random;

public class Ship {
    private Port port;
    private int shipCapacity;
    private int loadedContainers;
    private String type;


    public Ship(ShipCapacity shipCapacity) {
        this.shipCapacity = shipCapacity.getCapacity();
        this.type = shipCapacity.getName();

        Random random = new Random();
        // завантажуємо корабель контейнерами
        this.loadedContainers = random.nextInt(shipCapacity.getCapacity());
    }

    public void load() {

        loadedContainers++;
    }

    public void unload() {
        loadedContainers--;

    }

    public boolean isFull(){
        if (loadedContainers == shipCapacity)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if (loadedContainers == 0)
            return true;
        else
            return false;
    }

    public int getShipCapacity() {
        return shipCapacity;
    }

    public int getLoadedContainers() {
        return loadedContainers;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return View.infoAboutShip(this);
    }
}
