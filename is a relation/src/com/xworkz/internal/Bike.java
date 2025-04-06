package com.xworkz.internal;

public class Bike extends Vehicle{

    @Override
    public void stop(){
        System.out.println("Running stop in Bike...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Bike...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Bike...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Bike...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Bike...");
    }
}
