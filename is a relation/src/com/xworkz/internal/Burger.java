package com.xworkz.internal;

public class Burger extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Burger...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Burger...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Burger...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Burger...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Burger...");
    }
}
