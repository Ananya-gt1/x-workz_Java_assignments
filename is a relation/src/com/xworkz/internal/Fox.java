package com.xworkz.internal;

public class Fox extends Animal{

    @Override
    public void eat() {
        System.out.println("Running Eat in Fox...");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep in Fox...");
    }

    @Override
    public void hunt() {
        System.out.println("Running Hunt in Fox...");
    }

    @Override
    public void run() {
        System.out.println("Running Run in Fox...");
    }

    @Override
    public void breathe() {
        System.out.println("Running Breathe in Fox...");
    }
}
