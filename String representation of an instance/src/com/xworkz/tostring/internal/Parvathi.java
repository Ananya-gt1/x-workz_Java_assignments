package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.God;

public class Parvathi extends God {
    private String name;
    private String consort;
    private String form;
    private String vehicle;

    public Parvathi(String name, String consort, String form, String vehicle) {
        this.name = name;
        this.consort = consort;
        this.form = form;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Goddess: " + name + ", Consort: " + consort + ", Form: " + form + ", Vehicle: " + vehicle;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 47;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Hero");
            Hero hero1 = this;
            Hero hero2 = (Hero) obj;
            if (hero1.name == hero2.name && hero1.age == hero2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
