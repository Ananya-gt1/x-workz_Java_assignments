package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Industry;

public class ITIndustry extends Industry {
    private String companyName;
    private String location;
    private int numberOfEmployees;

    public ITIndustry(String companyName, String location, int numberOfEmployees) {
        this.companyName = companyName;
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "IT Industry - Company: " + companyName + ", Location: " + location + ", Employees: " + numberOfEmployees;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 66;
    }
}
