package com.xworkz.abstraction.internal;

public abstract class CarRace {
    public CarRace(){
        System.out.println("The no argument constructor of Future......");
    }
    public void driving(){
        System.out.println("Running driving in Car race...");
    }

    public abstract void chasing();
}
