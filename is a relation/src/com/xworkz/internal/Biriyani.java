package com.xworkz.internal;

public class Biriyani extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Biriyani...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Biriyani...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Biriyani...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Biriyani...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Biriyani...");
    }
}
