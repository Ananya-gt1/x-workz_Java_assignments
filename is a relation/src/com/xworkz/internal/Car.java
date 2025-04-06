package com.xworkz.internal;

public class Car extends Vehicle{

    @Override
    public void stop(){
        System.out.println("Running stop in Car...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Car...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Car...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Car...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Car...");
    }
}
