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
            System.out.println("The reference is FilmIndustry");
            FilmIndustry filmIndustry1 = this;
            FilmIndustry filmIndustry2 = (FilmIndustry) obj;
            if (filmIndustry1.industryName == filmIndustry2.industryName && filmIndustry1.headquarters == filmIndustry2.headquarters && filmIndustry1.numberOfMoviesPerYear == filmIndustry2.numberOfMoviesPerYear) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
