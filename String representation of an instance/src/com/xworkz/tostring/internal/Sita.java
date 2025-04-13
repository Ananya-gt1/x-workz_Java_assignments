package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.God;

public class Sita extends God {
    private String name;
    private String consort;
    private String birthPlace;
    private String knownFor;

    public Sita(String name, String consort, String birthPlace, String knownFor) {
        this.name = name;
        this.consort = consort;
        this.birthPlace = birthPlace;
        this.knownFor = knownFor;
    }

    @Override
    public String toString() {
        return "Goddess: " + name + ", Consort: " + consort + ", Birth Place: " + birthPlace + ", Known For: " + knownFor;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 26;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Sita");
            Sita sita1 = this;
            Sita sita2 = (Sita) obj;
            if (sita1.name == sita2.name ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
