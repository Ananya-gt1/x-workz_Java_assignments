package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Biology extends Subject {
    private String field;
    private boolean isTheoryHeavy;
    private int numberOfDiagrams;

    public Biology(String field, boolean isTheoryHeavy, int numberOfDiagrams) {
        this.field = field;
        this.isTheoryHeavy = isTheoryHeavy;
        this.numberOfDiagrams = numberOfDiagrams;
    }

    @Override
    public String toString() {
        return "Biology - Field: " + field +
                ", Theory Heavy: " + isTheoryHeavy +
                ", Diagrams: " + numberOfDiagrams;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 1;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Biology");
            Biology biology1 = this;
            Biology biology2 = (Biology) obj;
            if (biology1.field == biology2.field && biology1.isTheoryHeavy == biology2.isTheoryHeavy && biology1.numberOfDiagrams == biology2.numberOfDiagrams) {
                System.out.println("The objects are....."+biology1.equals(biology2));
                return true;
            }
        }
        return false;
    }
}
