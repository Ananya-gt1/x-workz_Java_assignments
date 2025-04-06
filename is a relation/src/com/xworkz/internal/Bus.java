package com.xworkz.internal;

public class Bus extends Vehicle {

    @Override
    public void stop(){
        System.out.println("Running stop in Bus...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Bus...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Bus...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Bus...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Bus...");
    }
}
