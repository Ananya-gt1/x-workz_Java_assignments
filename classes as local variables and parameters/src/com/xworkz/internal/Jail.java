package com.xworkz.internal;

public class Jail {
    private String name;
    private String jailerName;
    private String location;
    private int totalCells;

    public Jail(String name,String jailerName,String location,int totalCells){
        this.name=name;
        this.jailerName=jailerName;
        this.location=location;
        this.totalCells=totalCells;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getJailerName() {
        return jailerName;
    }
    public void setJailerName(String jailerName) {
        this.jailerName = jailerName;
    }

    public int getTotalCells() {
        return totalCells;
    }
    public void setTotalCells(int totalCells) {
        this.totalCells = totalCells;
    }
}
    

