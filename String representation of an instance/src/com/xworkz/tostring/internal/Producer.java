package com.xworkz.tostring.internal;

public class Producer {
    private String name;
    private int age;
    private String productionCompany;
    private String notableMovie;

    public Producer(String name, int age, String productionCompany, String notableMovie) {
        this.name = name;
        this.age = age;
        this.productionCompany = productionCompany;
        this.notableMovie = notableMovie;
    }

    @Override
    public String toString() {
        return "Producer: " + name + ", Age: " + age + ", Company: " + productionCompany + ", Known For: " + notableMovie;
    }
}
