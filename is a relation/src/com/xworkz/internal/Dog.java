package com.xworkz.internal;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Dog...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Dog...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Dog...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Dog...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Dog...");
    }
}
