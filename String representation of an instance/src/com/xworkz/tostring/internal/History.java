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
            System.out.println("The reference is History");
            History history1 = this;
            History history2 = (History) obj;
            if (history1.eraCovered == history2.eraCovered && history1.isAncientHistory == history2.isAncientHistory ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
