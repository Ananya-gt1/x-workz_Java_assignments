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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 55;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Hero");
            Hero hero1 = this;
            Hero hero2 = (Hero) obj;
            if (hero1.name == hero2.name && hero1.age == hero2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
