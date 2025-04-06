package com.xworkz.internal;

public class Pizza extends Food{

    @Override
    public void taste() {
        System.out.println("Running Taste in Pizza...");
    }

    @Override
    public void cook() {
        System.out.println("Running Cook in Pizza...");
    }

    @Override
    public void serve() {
        System.out.println("Running Serve in Pizza...");
    }

    @Override
    public void ingredients() {
        System.out.println("Running Ingredients in Pizza...");
    }

    @Override
    public void calories() {
        System.out.println("Running Calories in Pizza...");
    }
}
