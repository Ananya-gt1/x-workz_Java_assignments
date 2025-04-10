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
}
