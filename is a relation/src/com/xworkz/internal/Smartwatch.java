package com.xworkz.internal;

public class Smartwatch extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Smartwatch...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Smartwatch...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Smartwatch...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Smartwatch...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Smartwatch...");
    }
}
