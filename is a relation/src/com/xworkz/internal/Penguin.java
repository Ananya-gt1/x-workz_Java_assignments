package com.xworkz.internal;

public class Penguin extends Bookbrand {

    @Override
    public void publish() {

        System.out.println("Running Publish in Penguin...");
    }

    @Override
    public void genres() {

        System.out.println("Running Genres in Penguin...");
    }

    @Override
    public void authors() {
        System.out.println("Running Authors in Penguin...");
    }

    @Override
    public void priceRange() {

        System.out.println("Running Price Range in Penguin...");
    }

    @Override
    public void popularity() {

        System.out.println("Running Popularity in Penguin...");
    }
}
