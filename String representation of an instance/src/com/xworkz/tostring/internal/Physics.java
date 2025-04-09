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
}
