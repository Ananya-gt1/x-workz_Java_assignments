package com.xworkz.internal;

public class Donut extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Donut...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Donut...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Donut...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Donut...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Donut...");
    }
}
