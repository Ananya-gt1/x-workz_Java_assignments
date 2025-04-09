package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.WildAnimal;

public class Leopard extends WildAnimal {
    private String habitat;
    private boolean isClimber;
    private String spotsPattern;

    // Constructor
    public Leopard(String habitat, boolean isClimber, String spotsPattern) {
        this.habitat = habitat;
        this.isClimber = isClimber;
        this.spotsPattern = spotsPattern;
    }

    // toString method
    @Override
    public String toString() {
        return "Leopard - Habitat: " + habitat + ", Climber: " + isClimber + ", Spots Pattern: " + spotsPattern;
    }
}
