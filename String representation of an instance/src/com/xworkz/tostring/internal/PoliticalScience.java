package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class PoliticalScience extends Subject {
    private String ideologyFocus;
    private boolean includesConstitutionStudy;
    private int creditHours;

    public PoliticalScience(String ideologyFocus, boolean includesConstitutionStudy, int creditHours) {
        this.ideologyFocus = ideologyFocus;
        this.includesConstitutionStudy = includesConstitutionStudy;
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Political Science - Ideology Focus: " + ideologyFocus +
                ", Constitution Study: " + includesConstitutionStudy +
                ", Credit Hours: " + creditHours;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 43;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is PoliticalScience");
            PoliticalScience politicalScience1 = this;
            PoliticalScience politicalScience2 = (PoliticalScience) obj;
            if (politicalScience1.includesConstitutionStudy == politicalScience2.includesConstitutionStudy && politicalScience1.includesConstitutionStudy == politicalScience2.includesConstitutionStudy ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
