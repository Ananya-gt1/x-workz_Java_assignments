package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.DefenseForce;

public class CoastGuard extends DefenseForce {
    private String country;
    private int patrolBoats;
    private String directorGeneral;

    public CoastGuard(String country, int patrolBoats, String directorGeneral) {
        this.country = country;
        this.patrolBoats = patrolBoats;
        this.directorGeneral = directorGeneral;
    }

    @Override
    public String toString() {
        return "Coast Guard of " + country + ", Patrol Boats: " + patrolBoats + ", DG: " + directorGeneral;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 88;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is CoastGuard");
            CoastGuard coastGuard1 = this;
            CoastGuard coastGuard2 = (CoastGuard) obj;
            if (coastGuard1.country == coastGuard2.country && coastGuard1.patrolBoats == coastGuard2.patrolBoats && coastGuard1.directorGeneral == coastGuard2.directorGeneral) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
