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
}
