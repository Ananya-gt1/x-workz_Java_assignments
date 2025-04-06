package com.xworkz.internal;

public class Horse extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Horse...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Horse...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Horse...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Horse...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Horse...");
    }
}
