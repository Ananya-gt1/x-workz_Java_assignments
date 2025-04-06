package com.xworkz.internal;

public class Television extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Television...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Television...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Television...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Television...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Television...");
    }
}
