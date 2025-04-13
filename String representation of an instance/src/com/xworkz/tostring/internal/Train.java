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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Train");
            Train train1 = this;
            Train train2 = (Train) obj;
            if (train1.coaches == train2.coaches ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
