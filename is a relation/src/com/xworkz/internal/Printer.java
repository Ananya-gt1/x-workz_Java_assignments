package com.xworkz.internal;

public class Printer extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Printer...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Printer...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Printer...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Printer...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Printer...");
    }
}
