package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Subject;

public class History extends Subject {
    private String eraCovered;
    private String importantFigures;
    private boolean isAncientHistory;

    // Constructor
    public History(String eraCovered, String importantFigures, boolean isAncientHistory) {
        this.eraCovered = eraCovered;
        this.importantFigures = importantFigures;
        this.isAncientHistory = isAncientHistory;
    }

    // toString method
    @Override
    public String toString() {
        return "History - Era: " + eraCovered +
                ", Important Figures: " + importantFigures +
                ", Ancient History: " + isAncientHistory;
    }
}
