package com.xworkz.internal;

public class Microphone extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in Microphone...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in Microphone...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in Microphone...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in Microphone...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in Microphone...");
    }
}
