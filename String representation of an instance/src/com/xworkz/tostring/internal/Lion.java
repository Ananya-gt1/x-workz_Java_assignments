package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Lion extends WildAnimal {
    private String name;
    private String habitat;
    private int lifespan;

    public Lion(String name, String habitat, int lifespan) {
        this.name = name;
        this.habitat = habitat;
        this.lifespan = lifespan;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", habitat=" + habitat +
                ", lifespan=" + lifespan + " years"
               ;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 59;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Lion");
            Lion lion1 = this;
            Lion lion2 = (Lion) obj;
            if (lion1.name == lion2.name && lion1.habitat == lion2.habitat ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
