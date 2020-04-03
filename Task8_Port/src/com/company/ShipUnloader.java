package com.company;


public class ShipUnloader implements Runnable{
    private Port port;

    public ShipUnloader(Port port) {
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
            //for(int i = 0;i<loadedcontainers;i++) {
            while (!ship.isEmpty()){
                try {
                    Thread.sleep(90);
                    if (ship != null && !ship.isEmpty()) {
                        ship.unload();
                        port.addContainerToPort();
                        System.out.println("There are " + port.getContainersInPort() + " containers in the port now\n");
                        if (ship.getLoadedContainers()==0){
                            System.out.println("Ship \u001B[33m" + ship.getType() + "\u001B[37m number "+ ship.hashCode() +" unloaded");
                        }
                    } else {
                        System.out.println("Some strange occasion while unloading " + ship.toString());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}


