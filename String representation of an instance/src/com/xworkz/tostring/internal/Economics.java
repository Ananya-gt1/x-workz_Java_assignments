package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class Economics extends Subject {
    private String type;
    private boolean hasStatistics;
    private int totalUnits;

    public Economics(String type, boolean hasStatistics, int totalUnits) {
        this.type = type;
        this.hasStatistics = hasStatistics;
        this.totalUnits = totalUnits;
    }

    @Override
    public String toString() {
        return "Economics - Type: " + type +
                ", Includes Statistics: " + hasStatistics +
                ", Total Units: " + totalUnits;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 79;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Economics");
            Economics economics1 = this;
            Economics economics2 = (Economics) obj;
            if (economics1.type == economics2.type && economics1.hasStatistics == economics2.hasStatistics && economics1.totalUnits == economics2.totalUnits) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
