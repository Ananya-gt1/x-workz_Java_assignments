package com.xworkz.internal;

public class Romance extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in Romance");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in Romance");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in Romance");
    }

    @Override
    public void author() {
        System.out.println("Running Author in Romance");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in Romance");
    }
}
