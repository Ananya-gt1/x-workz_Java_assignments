package com.xworkz.external;

import com.xworkz.internal.Bicycle;
import com.xworkz.internal.BicycleChild;

public class BicycleDisplay {
    public void display(Bicycle bicycle) {
        bicycle.pedal();
        bicycle.brake();
        bicycle.ringBell();
        bicycle.turn();
        bicycle.adjustSeat();
        
        if (bicycle instanceof BicycleChild) {
            BicycleChild bicycleChild = (BicycleChild) bicycle;
            bicycleChild.bicycleSpecialAction();
        }
    }
}
