package com.xworkz.internal;

public class Procyon extends Star{

    @Override
    public void publish() {
        System.out.println("Running Publish in Procyon...");
    }

    @Override
    public void genres() {
        System.out.println("Running Genres in Procyon...");
    }

    @Override
    public void authors() {
        System.out.println("Running Authors in Procyon...");
    }

    @Override
    public void priceRange() {
        System.out.println("Running Price range in Procyon...");
    }

    @Override
    public void popularity() {
        System.out.println("Running Popularity in Procyon...");
    }
}
