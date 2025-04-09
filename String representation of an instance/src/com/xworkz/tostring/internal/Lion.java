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
}
