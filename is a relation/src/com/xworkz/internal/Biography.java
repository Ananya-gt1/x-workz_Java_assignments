package com.xworkz.internal;

public class Biography extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in Biography");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in Biography");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in Biography");
    }

    @Override
    public void author() {
        System.out.println("Running Author in Biography");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in Biography");
    }
}
