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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Autorickshaw");
            AutoRickshaw autoRickshaw1 = this;
            AutoRickshaw autoRickshaw2 = (AutoRickshaw) obj;
            if (autoRickshaw1.model == autoRickshaw2.model && autoRickshaw1.isElectric == autoRickshaw2.isElectric && autoRickshaw1.farePerKm == autoRickshaw2.farePerKm) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
