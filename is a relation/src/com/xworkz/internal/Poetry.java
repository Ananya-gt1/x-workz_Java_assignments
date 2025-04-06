package com.xworkz.internal;

public class Poetry extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in Poetry");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in Poetry");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in Poetry");
    }

    @Override
    public void author() {
        System.out.println("Running Author in Poetry");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in Poetry");
    }
}
