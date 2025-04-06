package com.xworkz.internal;

public class Orion extends Star{

    @Override
    public void publish() {
        System.out.println("Running Publish in Orion...");
    }

    @Override
    public void genres() {
        System.out.println("Running Genres in Orion...");
    }

    @Override
    public void authors() {
        System.out.println("Running Authors in Orion...");
    }

    @Override
    public void priceRange() {
        System.out.println("Running Price range in Orion...");
    }

    @Override
    public void popularity() {
        System.out.println("Running Popularity in Orion...");
    }
}
