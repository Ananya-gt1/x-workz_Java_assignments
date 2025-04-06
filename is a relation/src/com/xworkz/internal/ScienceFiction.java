package com.xworkz.internal;

public class ScienceFiction extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in ScienceFiction");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in ScienceFiction");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in ScienceFiction");
    }

    @Override
    public void author() {
        System.out.println("Running Author in ScienceFiction");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in ScienceFiction");
    }
}
