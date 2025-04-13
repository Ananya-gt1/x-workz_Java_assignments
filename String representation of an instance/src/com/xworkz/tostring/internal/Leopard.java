package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Leopard extends WildAnimal {
    private String habitat;
    private boolean isClimber;
    private String spotsPattern;

    public Leopard(String habitat, boolean isClimber, String spotsPattern) {
        this.habitat = habitat;
        this.isClimber = isClimber;
        this.spotsPattern = spotsPattern;
    }

    @Override
    public String toString() {
        return "Leopard - Habitat: " + habitat + ", Climber: " + isClimber + ", Spots Pattern: " + spotsPattern;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 61;
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
