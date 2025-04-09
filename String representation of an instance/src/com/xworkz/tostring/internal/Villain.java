package com.xworkz.tostring.internal;

public class Villain {
    private String name;
    private int age;
    private String evilStyle;
    private String famousMovie;

    public Villain(String name, int age, String evilStyle, String famousMovie) {
        this.name = name;
        this.age = age;
        this.evilStyle = evilStyle;
        this.famousMovie = famousMovie;
    }

    @Override
    public String toString() {
        return "Villain: " + name + ", Age: " + age + ", Style: " + evilStyle + ", Famous For: " + famousMovie;
    }
}
