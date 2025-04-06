package com.xworkz.internal;

public class Thriller extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in Thriller");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in Thriller");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in Thriller");
    }

    @Override
    public void author() {
        System.out.println("Running Author in Thriller");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in Thriller");
    }
}
