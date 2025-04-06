package com.xworkz.internal;

public class Panda extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Panda...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Panda...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Panda...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Panda...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Panda...");
    }
}
