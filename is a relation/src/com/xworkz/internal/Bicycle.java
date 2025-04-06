package com.xworkz.internal;

public class Bicycle extends Vehicle{

    @Override
    public void stop(){
        System.out.println("Running stop in Bicycle...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Bicycle...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Bicycle...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Bicycle...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Bicycle...");
    }
}
