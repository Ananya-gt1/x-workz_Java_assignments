package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class Train extends Vehicle {
    private String trainName;
    private int coaches;
    private boolean isExpress;

    public Train(String trainName, int coaches, boolean isExpress) {
        this.trainName = trainName;
        this.coaches = coaches;
        this.isExpress = isExpress;
    }

    @Override
    public String toString() {
        return "Train - Name: " + trainName + ", Coaches: " + coaches + ", Express: " + isExpress;
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 16;
    }
}
