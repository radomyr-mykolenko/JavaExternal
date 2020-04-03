package com.company;

public class Main {

    public static void main(String[] args) {
        Port port = new Port();
        ShipGenerator shipGenerator = new ShipGenerator(port, 3);
        Thread shipGen = new Thread(shipGenerator,"Shipgenerator");
        shipGen.start();

        ShipUnloader shipUnloader = new ShipUnloader(port);
        ShipLoader shipLoader = new ShipLoader(port);
        Thread shipLoad = new Thread(shipLoader,"ShipLoader");
        Thread shipUnload = new Thread(shipUnloader,"ShipUnloader");
        shipUnload.start();
        shipLoad.start();
        //ShipLoader shipLoader = new ShipLoader();

    }
}
