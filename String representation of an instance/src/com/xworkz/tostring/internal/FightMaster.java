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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 76;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Airplane");
            Airplane airplane1 = this;
            Airplane airplane2 = (Airplane) obj;
            if (airplane1.airline == airplane2.airline && airplane1.passengerCapacity == airplane2.passengerCapacity && airplane1.isInternational == airplane2.isInternational) {
                System.out.println("The Air Plane are same.....");
                return true;
            }
        }
        return false;
    }
}
