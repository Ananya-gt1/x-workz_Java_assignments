package com.xworkz.internal;

public class Snake extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Snake...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Snake...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Snake...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Snake...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Snake...");
    }
}
