package com.xworkz.projector.internal;

public class Warranty {
    private String startDate;
    private String endDate;

    public Warranty(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void showWatterny() {
        System.out.println("Warranty Start Date: " + startDate + ", End Date: " + endDate);
    }
}
