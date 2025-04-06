package com.xworkz.internal;

public class Sirius extends Star{

    @Override
    public void publish() {
        System.out.println("Running Publish in Sirius...");
    }

    @Override
    public void genres() {
        System.out.println("Running Genres in Sirius...");
    }

    @Override
    public void authors() {
        System.out.println("Running Authors in Sirius...");
    }

    @Override
    public void priceRange() {
        System.out.println("Running Price range in Sirius...");
    }

    @Override
    public void popularity() {
        System.out.println("Running Popularity in Sirius...");
    }
}
