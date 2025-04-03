package com.xworkz.runner;

import com.xworkz.internal.*;

public class ElectronicsRunner {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.powerOn();
        smartphone.powerOff();
        smartphone.batteryStatus();
        smartphone.buy();
        smartphone.softwareUpdate();

        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.powerOff();
        laptop.batteryStatus();
        laptop.buy();
        laptop.softwareUpdate();

        Television television = new Television();
        television.powerOn();
        television.powerOff();
        television.batteryStatus();
        television.buy();
        television.softwareUpdate();

        Headphone headphone = new Headphone();
        headphone.powerOn();
        headphone.powerOff();
        headphone.batteryStatus();
        headphone.buy();
        headphone.softwareUpdate();

        Monitor monitor = new Monitor();
        monitor.powerOn();
        monitor.powerOff();
        monitor.batteryStatus();
        monitor.buy();
        monitor.softwareUpdate();

        Microphone microphone = new Microphone();
        microphone.powerOn();
        microphone.powerOff();
        microphone.batteryStatus();
        microphone.buy();
        microphone.softwareUpdate();

        Printer printer = new Printer();
        printer.powerOn();
        printer.powerOff();
        printer.batteryStatus();
        printer.buy();
        printer.softwareUpdate();

        GamingConsole gamingConsole = new GamingConsole();
        gamingConsole.powerOn();
        gamingConsole.powerOff();
        gamingConsole.batteryStatus();
        gamingConsole.buy();
        gamingConsole.softwareUpdate();

        Smartwatch smartwatch = new Smartwatch();
        smartwatch.powerOn();
        smartwatch.powerOff();
        smartwatch.batteryStatus();
        smartwatch.buy();
        smartwatch.softwareUpdate();

        Speaker speaker = new Speaker();
        speaker.powerOn();
        speaker.powerOff();
        speaker.batteryStatus();
        speaker.buy();
        speaker.softwareUpdate();

    }
}
