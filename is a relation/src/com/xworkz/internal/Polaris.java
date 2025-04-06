package com.xworkz.internal;

public class Polaris extends Star{

    @Override
    public void publish() {
        System.out.println("Running Publish in Polaris...");
    }

    @Override
    public void genres() {
        System.out.println("Running Genres in Polaris...");
    }

    @Override
    public void authors() {
        System.out.println("Running Authors in Polaris...");
    }

    @Override
    public void priceRange() {
        System.out.println("Running Price range in Polaris...");
    }

    @Override
    public void popularity() {
        System.out.println("Running Popularity in Polaris...");
    }
}
