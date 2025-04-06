package com.xworkz.internal;

public class Sandwich extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Sandwich...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Sandwich...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Sandwich...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Sandwich...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Sandwich...");
    }
}
