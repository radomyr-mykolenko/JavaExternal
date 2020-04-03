package com.company;

import java.util.Random;

public class Ship {
    private int shipCapacity;
    private int loadedContainers;
    private int minCapacity = 0;
    private String type;
    //private boolean loaded;

    public Ship(ShipCapacity shipCapacity) {
        this.shipCapacity = shipCapacity.getCapacity();
        this.type = shipCapacity.getName();
        Random random = new Random();
        // завантажуємо корабель контейнерами
        this.loadedContainers = random.nextInt(shipCapacity.getCapacity());

    }

    public void load() {
        loadedContainers++;
        System.out.println("\u001B[31mLoading  \u001B[37m \n Container loaded to " + this.toString());
    }

    public void unload() {
        loadedContainers--;
        System.out.println("\u001B[34mUnloading  \u001B[37m \n Container removed from " + this.toString());
    }

    public boolean checkCapacity() {
        if ((loadedContainers >= shipCapacity)||(loadedContainers==0)) {
            return false;
        }
        return true;
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
        return "ship type: \u001B[33m" + this.getType() + "\u001B[37m. Number is "+ this.hashCode() + ". Its capacity is " + this.shipCapacity +" containers \n" + "\u001B[32mOn board: " + this.loadedContainers + " containers\u001B[37m\n";
    }
}
