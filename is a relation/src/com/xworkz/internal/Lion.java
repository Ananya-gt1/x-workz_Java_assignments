package com.xworkz.internal;

public class Lion extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Lion...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Lion...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Lion...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Lion...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Lion...");
    }
}
