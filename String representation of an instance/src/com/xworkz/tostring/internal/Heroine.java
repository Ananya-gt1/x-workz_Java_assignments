package com.xworkz.tostring.internal;

public class Heroine {
    private String name;
    private int age;
    private String debutMovie;
    private String popularRole;

    public Heroine(String name, int age, String debutMovie, String popularRole) {
        this.name = name;
        this.age = age;
        this.debutMovie = debutMovie;
        this.popularRole = popularRole;
    }

    @Override
    public String toString() {
        return "Heroine: " + name + ", Age: " + age + ", Debut: " + debutMovie + ", Popular Role: " + popularRole;
    }
}
