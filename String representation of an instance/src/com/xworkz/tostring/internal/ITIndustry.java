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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is ITIndustry");
            ITIndustry itIndustry1 = this;
            ITIndustry itIndustry2 = (ITIndustry) obj;
            if (itIndustry1.companyName == itIndustry2.companyName && itIndustry1.location == itIndustry2.location ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
