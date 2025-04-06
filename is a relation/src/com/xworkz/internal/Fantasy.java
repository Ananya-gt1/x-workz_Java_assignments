package com.xworkz.internal;

public class Fantasy extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in Fantasy");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in Fantasy");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in Fantasy");
    }

    @Override
    public void author() {
        System.out.println("Running Author in Fantasy");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in Fantasy");
    }
}
