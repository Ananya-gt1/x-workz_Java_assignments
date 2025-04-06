package com.xworkz.internal;

public class Rocket extends  Vehicle{

    @Override
    public void stop(){
        System.out.println("Running stop in Rocket...");
    }

    @Override
    public void start(){
        System.out.println("Running start in Rocket...");
    }

    @Override
    public void horn(){
        System.out.println("Running horn in Rocket...");
    }

    @Override
    public void buy(){
        System.out.println("Running Buy in Rocket...");
    }

    @Override
    public void capacity() {
        System.out.println("Running Capacity in Rocket...");
    }
}
