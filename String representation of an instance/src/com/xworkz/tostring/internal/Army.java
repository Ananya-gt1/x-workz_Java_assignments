package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.DefenseForce;

public class Army extends DefenseForce {
    private String country;
    private int soldiersCount;
    private String commander;

    // Constructor
    public Army(String country, int soldiersCount, String commander) {
        this.country = country;
        this.soldiersCount = soldiersCount;
        this.commander = commander;
    }

    // toString method
    @Override
    public String toString() {
        return "Army of " + country + ", Soldiers: " + soldiersCount + ", Commander: " + commander;
    }
}
