package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Industry;

public class FilmIndustry extends Industry {
    private String industryName;
    private String headquarters;
    private int numberOfMoviesPerYear;

    public FilmIndustry(String industryName, String headquarters, int numberOfMoviesPerYear) {
        this.industryName = industryName;
        this.headquarters = headquarters;
        this.numberOfMoviesPerYear = numberOfMoviesPerYear;
    }

    @Override
    public String toString() {
        return "Film Industry: " + industryName + ", HQ: " + headquarters + ", Movies/Year: " + numberOfMoviesPerYear;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 75;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Airplane");
            Airplane airplane1 = this;
            Airplane airplane2 = (Airplane) obj;
            if (airplane1.airline == airplane2.airline && airplane1.passengerCapacity == airplane2.passengerCapacity && airplane1.isInternational == airplane2.isInternational) {
                System.out.println("The Air Plane are same.....");
                return true;
            }
        }
        return false;
    }
}
