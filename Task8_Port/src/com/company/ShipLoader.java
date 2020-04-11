package com.company;

public class ShipLoader implements Runnable {
    private Port port;
    private Ship ship;

    public ShipLoader(Port port) {
        this.port = port;
        new Thread(this).start();
    }

    public ShipLoader(Ship ship, Port port) {
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

        synchronized (port) {
            while (!ship.isFull() && port.checkContainersPresenceInPort()) {
                try {
                    Thread.sleep(20);
                    if (ship != null && !ship.isFull()) {
                        port.operateWithContainersInThePort("-");
                        ship.load();
                        View.printLoading(ship, port);

                        if (ship.getLoadedContainers() == ship.getShipCapacity()) {
                            View.printShipLoaded(ship);
                        }

                    } else {
                        View.printLoadingIsForbidden(ship);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


