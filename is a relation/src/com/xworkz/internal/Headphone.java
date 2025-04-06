package com.xworkz.internal;

public class Headphone extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Headphone...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Headphone...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Headphone...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Headphone...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Headphone...");
    }
}
