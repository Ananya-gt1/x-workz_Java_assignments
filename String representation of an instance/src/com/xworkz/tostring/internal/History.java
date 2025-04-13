package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class History extends Subject {
    private String eraCovered;
    private String importantFigures;
    private boolean isAncientHistory;

    public History(String eraCovered, String importantFigures, boolean isAncientHistory) {
        this.eraCovered = eraCovered;
        this.importantFigures = importantFigures;
        this.isAncientHistory = isAncientHistory;
    }

    @Override
    public String toString() {
        return "History - Era: " + eraCovered +
                ", Important Figures: " + importantFigures +
                ", Ancient History: " + isAncientHistory;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 68;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Hero");
            Hero hero1 = this;
            Hero hero2 = (Hero) obj;
            if (hero1.name == hero2.name && hero1.age == hero2.age ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
