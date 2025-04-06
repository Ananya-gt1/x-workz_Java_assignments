package com.xworkz.internal;

public class Cake extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Cake...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Cake...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Cake...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Cake...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Cake...");
    }
}
