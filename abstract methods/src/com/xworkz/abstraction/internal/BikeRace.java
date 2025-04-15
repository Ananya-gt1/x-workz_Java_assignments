package com.xworkz.abstraction.internal;

public abstract class BikeRace {
    private String bikeName;
    private double raceTime;
    private String location;

    public BikeRace(String bikeName,double raceTime,String location){
        this.bikeName=bikeName;
        this.raceTime=raceTime;
        this.location=location;
        System.out.println("The no argument constructor of Bike race.....");
    }

}
