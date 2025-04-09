package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Biology extends Subject {
    private String field;
    private boolean isTheoryHeavy;
    private int numberOfDiagrams;

    // Constructor
    public Biology(String field, boolean isTheoryHeavy, int numberOfDiagrams) {
        this.field = field;
        this.isTheoryHeavy = isTheoryHeavy;
        this.numberOfDiagrams = numberOfDiagrams;
    }

    // toString method
    @Override
    public String toString() {
        return "Biology - Field: " + field +
                ", Theory Heavy: " + isTheoryHeavy +
                ", Diagrams: " + numberOfDiagrams;
    }
}
