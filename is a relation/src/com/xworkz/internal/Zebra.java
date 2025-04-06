package com.xworkz.internal;

public class Zebra extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Zebra...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Zebra...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Zebra...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Zebra...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Zebra...");
    }
}
