package com.company;


import java.sql.SQLOutput;

public class ShipLoader implements Runnable{
    private Port port;

    public ShipLoader(Port port) {
        this.port = port;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Ship ship : port.getShipsInPort()) {
            Thread.currentThread().setName("Unloading " + ship.getType());
            //int loadedcontainers = ship.getLoadedContainers();
            //for(int i = loadedcontainers;i<ship.getShipCapacity();i++) {
            while (!ship.isFull()){
                try {
                    Thread.sleep(100);
                    if (ship != null && !ship.isFull()) {
                        port.removeContainerFromPort();
                        ship.load();
                        if (ship.getLoadedContainers()==ship.getShipCapacity()){
                        System.out.println("Ship \u001B[33m" + ship.getType() + "\u001B[37m number "+ ship.hashCode() +" loaded\n");
                        }
                        System.out.println("There are " + port.getContainersInPort() + " containers in the port now\n");
                    } else {
                        System.out.println("Loading is forbidden now for " + ship.toString() + "Try to unload it\n");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}


