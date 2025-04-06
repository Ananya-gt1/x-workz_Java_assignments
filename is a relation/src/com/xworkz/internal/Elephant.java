package com.xworkz.internal;

public class Elephant extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Elephant...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Elephant...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Elephant...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Elephant...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Elephant...");
    }
}
