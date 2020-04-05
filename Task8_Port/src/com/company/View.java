package com.company;

public class View {

    public static String infoAboutShip(Ship ship){
        return "ship type: \u001B[33m" + ship.getType() + "\u001B[37m. Number is "+ ship.hashCode() + ". Its capacity is " + ship.getShipCapacity() +" containers \n" + "\u001B[32mOn board: " + ship.getLoadedContainers() + " containers\u001B[37m\n";
    }
    public static void printLoading(Ship ship, Port port){
        System.out.println("\u001B[31mLoading  \u001B[37m \n Container loaded to " + ship.toString() +
                "There are " + port.getContainersInPort() + " containers in the port now\n");
    }

    public static void printUnloading(Ship ship, Port port){
        System.out.println("\u001B[34mUnloading  \u001B[37m \n Container removed from " + ship.toString() +
                "There are " + port.getContainersInPort() + " containers in the port now\n");
    }

    public static void printStartLoadingUnloading(Ship ship){
        System.out.println("Loading/Unloading of ship \u001B[33m" + ship.getType() + "\u001B[37m started");
    }
    public static void printShipLoaded(Ship ship){
        System.out.println("Ship \u001B[33m" + ship.getType() + "\u001B[37m number " + ship.hashCode() + " loaded\n");
    }

    public static void printShipUnloaded(Ship ship){
        System.out.println("Ship \u001B[33m" + ship.getType() + "\u001B[37m number " + ship.hashCode() + " unloaded");
    }
    public static void printLoadingIsForbidden(Ship ship){
        System.out.println("Loading is forbidden now for " + ship.toString() + "Try to unload it\n");
    }
    public static void printUnloadingIsForbidden(Ship ship){
        System.out.println("Unloading is forbidden now for " + ship.toString() + "Try to load it\n");
    }

}
