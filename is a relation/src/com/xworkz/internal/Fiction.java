package com.xworkz.internal;

public class Fiction extends Book{

    @Override
    public void read() {
        System.out.println("Running Read in Fiction");
    }

    @Override
    public void summary() {
        System.out.println("Running Summary in Fiction");
    }

    @Override
    public void characters() {
        System.out.println("Running Characters in Fiction");
    }

    @Override
    public void author() {
        System.out.println("Running Author in Fiction");
    }

    @Override
    public void pages() {
        System.out.println("Running Pages in Fiction");
    }
}
