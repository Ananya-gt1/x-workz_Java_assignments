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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 42;
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
