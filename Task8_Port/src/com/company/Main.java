package com.company;

public class Main {

    public static void main(String[] args) {
        Port port = new Port();
        new ShipGenerator(port, 3);
        new ExecuteLoadingUnloading(port).start();

    }
}
