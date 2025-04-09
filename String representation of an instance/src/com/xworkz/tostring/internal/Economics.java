package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Economics extends Subject {
    private String type;
    private boolean hasStatistics;
    private int totalUnits;

    // Constructor
    public Economics(String type, boolean hasStatistics, int totalUnits) {
        this.type = type;
        this.hasStatistics = hasStatistics;
        this.totalUnits = totalUnits;
    }

    // toString method
    @Override
    public String toString() {
        return "Economics - Type: " + type +
                ", Includes Statistics: " + hasStatistics +
                ", Total Units: " + totalUnits;
    }
}
