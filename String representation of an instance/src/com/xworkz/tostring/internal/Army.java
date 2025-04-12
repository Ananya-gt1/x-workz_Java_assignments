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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Army");
            Army army1 = this;
            Army army2 = (Army) obj;
            if (army1.country == army2.country && army1.soldiersCount == army2.soldiersCount && army1.commander == army2.commander) {
                System.out.println("The Army  are same.....");
                return true;
            }
        }
        return false;
    }
}
