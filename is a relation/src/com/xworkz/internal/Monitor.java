package com.xworkz.internal;

public class Monitor extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Monitor...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Monitor...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Monitor...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Monitor...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Monitor...");
    }
}
