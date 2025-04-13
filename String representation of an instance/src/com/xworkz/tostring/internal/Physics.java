package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Physics extends Subject {
    private String branch;
    private boolean requiresLab;
    private int equationCount;

    public Physics(String branch, boolean requiresLab, int equationCount) {
        this.branch = branch;
        this.requiresLab = requiresLab;
        this.equationCount = equationCount;
    }

    @Override
    public String toString() {
        return "Physics - Branch: " + branch +
                ", Requires Lab: " + requiresLab +
                ", Equation Count: " + equationCount;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 46;
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
