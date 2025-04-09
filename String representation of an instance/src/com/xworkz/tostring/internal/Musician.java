package com.xworkz.tostring.internal;

public class Musician {
    private String name;
    private int age;
    private String specialization;
    private String famousWork;

    public Musician(String name, int age, String specialization, String famousWork) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.famousWork = famousWork;
    }

    @Override
    public String toString() {
        return "Musician: " + name + ", Age: " + age + ", Specialization: " + specialization + ", Famous For: " + famousWork;
    }
}
