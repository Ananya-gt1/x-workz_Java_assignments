package com.xworkz.internal;

public class GamingConsole extends Electronics{

    @Override
    public void powerOn() {
        System.out.println("Running Power On in GamingConsole...");
    }

    @Override
    public void powerOff() {
        System.out.println("Running Power off in GamingConsole...");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Running Battery status in GamingConsole...");
    }

    @Override
    public void buy() {
        System.out.println("Running Buy in GamingConsole...");
    }

    @Override
    public void softwareUpdate() {
        System.out.println("Running Software update in GamingConsole...");
    }
}
