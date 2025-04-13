package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.God;

public class Brahma extends God {
    private String name;
    private int numberOfHeads;
    private String vehicle;
    private String consort;

    public Brahma(String name, int numberOfHeads, String vehicle, String consort) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.vehicle = vehicle;
        this.consort = consort;
    }

    @Override
    public String toString() {
        return "God: " + name + ", Heads: " + numberOfHeads + ", Vehicle: " + vehicle + ", Consort: " + consort;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 98;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Brahma");
            Brahma brahma1 = this;
            Brahma brahma2 = (Brahma) obj;
            if (brahma1.name == brahma2.name && brahma1.numberOfHeads == brahma2.numberOfHeads && brahma1.consort == brahma2.consort) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
