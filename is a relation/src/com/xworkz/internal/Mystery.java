package com.xworkz.internal;

public class Mystery extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in Mystery");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in Mystery");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in Mystery");
    }

    @Override
    public void author() {
        System.out.println("Running Author in Mystery");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in Mystery");
    }
}
