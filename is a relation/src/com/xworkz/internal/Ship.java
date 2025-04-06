package com.xworkz.internal;

public class Ship extends Vehicle{

    @Override
    public void stop(){
        System.out.println("Running stop in Ship...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Ship...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Ship...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Ship...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Ship...");
    }
}
