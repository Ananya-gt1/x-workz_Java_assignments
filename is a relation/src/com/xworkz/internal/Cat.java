package com.xworkz.internal;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Cat...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Cat...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Cat...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Cat...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Cat...");
    }
}
