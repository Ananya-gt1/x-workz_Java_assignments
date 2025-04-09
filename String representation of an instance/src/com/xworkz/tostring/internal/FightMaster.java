package com.xworkz.tostring.internal;

public class FightMaster {
    private String name;
    private int age;
    private String fightStyle;
    private String popularMovie;

    public FightMaster(String name, int age, String fightStyle, String popularMovie) {
        this.name = name;
        this.age = age;
        this.fightStyle = fightStyle;
        this.popularMovie = popularMovie;
    }

    @Override
    public String toString() {
        return "Fight Master: " + name + ", Age: " + age + ", Style: " + fightStyle + ", Known For: " + popularMovie;
    }
}
