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
            System.out.println("The reference is Airplane");
            Airplane airplane1 = this;
            Airplane airplane2 = (Airplane) obj;
            if (airplane1.airline == airplane2.airline && airplane1.passengerCapacity == airplane2.passengerCapacity && airplane1.isInternational == airplane2.isInternational) {
                System.out.println("The Air Plane are same.....");
                return true;
            }
        }
        return false;
    }
}
