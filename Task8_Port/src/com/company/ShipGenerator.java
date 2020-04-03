package com.company;

import java.util.Random;

public class ShipGenerator implements Runnable {
    private Port port;
    private int shipCount;

    public ShipGenerator(Port port, int shipCount) {
        this.port = port;
        this.shipCount = shipCount;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < port.getMaxShipsInPort()) {
            Thread.currentThread().setName(" Generator ship");
            count++;
            port.add(new Ship(getShipType()));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private ShipCapacity getShipType() {
        Random random = new Random();
        return ShipCapacity.values()[random.nextInt(ShipCapacity.values().length)];
    }


}
