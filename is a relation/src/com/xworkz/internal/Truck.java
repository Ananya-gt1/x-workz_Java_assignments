package com.xworkz.internal;

public class Truck extends Vehicle{

    @Override
    public void stop(){
        System.out.println("Running stop in Truck...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Truck...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Truck...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Truck...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Truck...");
    }

}
