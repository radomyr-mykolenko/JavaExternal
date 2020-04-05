package com.company;


public class ShipUnloader implements Runnable {
    private Port port;
    private Ship ship;

    public ShipUnloader(Ship ship, Port port) {
        this.port = port;
        this.ship = ship;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (!ship.isEmpty()) {
            try {
                Thread.sleep(10);
                if (ship != null && !ship.isEmpty()) {
                    ship.unload();
                    port.operateWithContainersInThePort("+");

                    View.printUnloading(ship,port);
                    if (ship.getLoadedContainers() == 0) {
                       View.printShipUnloaded(ship);
                    }
                } else {
                    View.printUnloadingIsForbidden(ship);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
           }
        }
    }

}


