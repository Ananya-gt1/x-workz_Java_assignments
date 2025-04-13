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
            System.out.println("The reference is Fight Master");
            FightMaster fightMaster1 = this;
            FightMaster fightMaster2 = (FightMaster) obj;
            if (fightMaster1.name == fightMaster2.name && fightMaster1.age == fightMaster2.age && fightMaster1.fightStyle == fightMaster2.fightStyle) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
