package com.company;

public class ExecuteLoadingUnloading {
    private Port port;

    public ExecuteLoadingUnloading(Port port) {
        this.port = port;
    }
    public void start(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Ship ship : port.getShipsInPort()){
            View.printStartLoadingUnloading(ship);
            new ShipUnloader(ship,port);
            new ShipLoader(ship,port);
        }
    }
}
