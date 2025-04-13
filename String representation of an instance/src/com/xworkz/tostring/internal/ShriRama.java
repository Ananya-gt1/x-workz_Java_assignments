package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.God;

public class ShriRama extends God {
    private String name;
    private String consort;
    private String bow;
    private String kingdom;

    public ShriRama(String name, String consort, String bow, String kingdom) {
        this.name = name;
        this.consort = consort;
        this.bow = bow;
        this.kingdom = kingdom;
    }

    @Override
    public String toString() {
        return "God: " + name + ", Consort: " + consort + ", Bow: " + bow + ", Kingdom: " + kingdom;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 28;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is ShriRama");
            ShriRama shriRama1 = this;
            ShriRama shriRama2 = (ShriRama) obj;
            if (shriRama1.name == shriRama2.name ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
