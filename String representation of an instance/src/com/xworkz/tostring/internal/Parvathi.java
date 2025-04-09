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
}
