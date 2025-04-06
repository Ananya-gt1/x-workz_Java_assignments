package com.xworkz.internal;

public class   Scholastic extends Bookbrand {

    @Override
    public void publish() {

        System.out.println("Running Publish in Scholastic...");
    }

    @Override
    public void genres() {

        System.out.println("Running Genres in Scholastic...");
    }

    @Override
    public void authors() {
        System.out.println("Running Authors in Scholastic...");
    }

    @Override
    public void priceRange() {

        System.out.println("Running Price Range in Scholastic...");
    }

    @Override
    public void popularity() {

        System.out.println("Running Popularity in Scholastic...");
    }
}
