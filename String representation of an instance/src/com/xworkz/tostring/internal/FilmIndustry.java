package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Industry;

public class FilmIndustry extends Industry {
    private String industryName;
    private String headquarters;
    private int numberOfMoviesPerYear;

    // Constructor
    public FilmIndustry(String industryName, String headquarters, int numberOfMoviesPerYear) {
        this.industryName = industryName;
        this.headquarters = headquarters;
        this.numberOfMoviesPerYear = numberOfMoviesPerYear;
    }

    // toString method
    @Override
    public String toString() {
        return "Film Industry: " + industryName + ", HQ: " + headquarters + ", Movies/Year: " + numberOfMoviesPerYear;
    }
}
