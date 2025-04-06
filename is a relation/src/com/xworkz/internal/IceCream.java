package com.xworkz.internal;

public class IceCream extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in IceCream...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in IceCream...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in IceCream...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in IceCream...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in IceCream...");
    }
}
