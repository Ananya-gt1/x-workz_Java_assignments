package com.xworkz.internal;

public class History extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in History");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in History");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in History");
    }

    @Override
    public void author() {
        System.out.println("Running Author in History");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in History");
    }
}
