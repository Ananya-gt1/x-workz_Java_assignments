package com.xworkz.internal;

public class Tractor extends Vehicle{

    @Override
    public void stop(){
        System.out.println("Running stop in Tractor...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Tractor...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Tractor...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Tractor...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Tractor...");
    }
}
