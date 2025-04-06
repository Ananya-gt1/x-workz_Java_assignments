package com.xworkz.internal;

public class Laptop extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Laptop...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Laptop...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Laptop...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Laptop...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Laptop...");
    }
}
