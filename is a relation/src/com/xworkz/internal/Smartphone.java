package com.xworkz.internal;

public class Smartphone extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Smartphone...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Smartphone...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Smartphone...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Smartphone...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Smartphone...");
    }
}
