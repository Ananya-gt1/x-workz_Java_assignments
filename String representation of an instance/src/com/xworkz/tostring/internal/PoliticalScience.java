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
}
