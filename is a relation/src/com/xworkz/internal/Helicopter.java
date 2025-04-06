package com.xworkz.internal;

public class Helicopter extends Vehicle{

    @Override
    public void stop(){
        System.out.println("Running stop in Helicopter...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Helicopter...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Helicopter...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Helicopter...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Helicopter...");
    }
}
