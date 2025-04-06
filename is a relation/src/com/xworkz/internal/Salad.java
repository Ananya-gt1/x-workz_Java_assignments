package com.xworkz.internal;

public class Salad extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Salad...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Salad...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Salad...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Salad...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Salad...");
    }
}
