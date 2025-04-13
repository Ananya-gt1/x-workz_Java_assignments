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
            System.out.println("The reference is Producer");
            Producer producer1 = this;
            Producer producer2 = (Producer) obj;
            if (producer1.name == producer2.name && producer1.age == producer2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
