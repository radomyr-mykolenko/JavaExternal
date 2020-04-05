package com.company;

import java.util.ArrayList;
import java.util.List;

public class Port {
    private List<Ship> shipsInPort;
    private final int maxShipsInPort = 3;
    private int shipsCounter = 0;
    private int containersInPort;

    public Port(){
        shipsInPort = new ArrayList<>();
        setContainersInPort(50);

    }
    public synchronized boolean add(Ship ship) {

        try {
            if (shipsCounter < maxShipsInPort) {
                notifyAll();
                //System.out.println(ship.toString());
                shipsInPort.add(ship);
                String info = String.format("There are %s ships in the port now, its maximum capacity is "+ this.getMaxShipsInPort() + " ships \n arrived such ship to the port - %s", shipsInPort.size(), ship.toString(), Thread.currentThread().getName());
                System.out.println(info);
            } else {
                System.out.println(shipsInPort.size()-getMaxShipsInPort() + "Ship are waiting in the sea. There is no place for them in the Port for loading/unloading now: " + Thread.currentThread().getName());
                wait();
                return false;
            }
            shipsCounter++;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public int getMaxShipsInPort() {
        return maxShipsInPort;
    }
    public List<Ship> getShipsInPort(){
        return shipsInPort;
    }
    public int getContainersInPort() {
        return containersInPort;
    }

    public void  addContainerToPort() {
        containersInPort++;

    }
    public void removeContainerFromPort(){
        if (getContainersInPort()>0){
            containersInPort--;
        }
        else {
            System.out.println("You removed all containers from port");
        }
    }

    public synchronized void operateWithContainersInThePort(String task){
       /* try {
           // wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        switch (task){
            case "+":{
                containersInPort++;
            }
            case "-":{
                if (getContainersInPort()>0){
                    containersInPort--;
                }
                else {
                    System.out.println("You removed all containers from port");
                }
            }
        }
       // notifyAll();

    }

    public void setContainersInPort(int containersInPort) {
        this.containersInPort = containersInPort;
        System.out.println("\n There are "+getContainersInPort()+ " containers in the port\n");
    }


    public boolean checkContainersPresenceInPort(){
        if (getContainersInPort() == 0)
            return false;
        else return true;
    }
}
