package com.xworkz.internal;

public class Soup extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Soup...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Soup...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Soup...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Soup...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Soup...");
    }
}
