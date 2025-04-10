package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Vehicle;

public class AutoRickshaw extends Vehicle {
    private String model;
    private boolean isElectric;
    private int farePerKm;

    public AutoRickshaw(String model, boolean isElectric, int farePerKm) {
        this.model = model;
        this.isElectric = isElectric;
        this.farePerKm = farePerKm;
    }

    @Override
    public String toString() {
        return "AutoRickshaw - Model: " + model + ", Electric: " + isElectric + ", Fare: ₹" + farePerKm + "/km";
    }
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 4;
    }
}
