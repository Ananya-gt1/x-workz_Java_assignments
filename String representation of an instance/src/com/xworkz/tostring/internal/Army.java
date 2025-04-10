package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.DefenseForce;

public class Army extends DefenseForce {
    private String country;
    private int soldiersCount;
    private String commander;

    public Army(String country, int soldiersCount, String commander) {
        this.country = country;
        this.soldiersCount = soldiersCount;
        this.commander = commander;
    }

    @Override
    public String toString() {
        return "Army of " + country + ", Soldiers: " + soldiersCount + ", Commander: " + commander;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 8;
    }
}
