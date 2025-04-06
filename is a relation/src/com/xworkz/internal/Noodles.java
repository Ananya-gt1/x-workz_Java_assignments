package com.xworkz.internal;

public class Noodles extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Noodles...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Noodles...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Noodles...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Noodles...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Noodles...");
    }
}
