package com.xworkz.internal;

public class Eagle extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Eagle...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Eagle...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Eagle...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Eagle...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Eagle...");
    }
}
