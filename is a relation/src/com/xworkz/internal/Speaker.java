package com.xworkz.internal;

public class Speaker extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Speaker...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Speaker...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Speaker...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Speaker...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Speaker...");
    }
}
