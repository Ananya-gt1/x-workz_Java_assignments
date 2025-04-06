package com.xworkz.internal;

public class NonFiction extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in NonFiction");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in NonFiction");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in NonFiction");
    }

    @Override
    public void author() {
        System.out.println("Running Author in NonFiction");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in NonFiction");
    }
}
