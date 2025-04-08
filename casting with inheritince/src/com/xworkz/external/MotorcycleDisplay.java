package com.xworkz.external;

import com.xworkz.internal.Motorcycle;
import com.xworkz.internal.MotorcycleChild;

public class MotorcycleDisplay {
    public void display(Motorcycle motorcycle) {
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.changeGear();
        motorcycle.startEngine();
        motorcycle.park();
        
        if (motorcycle instanceof MotorcycleChild) {
            MotorcycleChild motorcycleChild = (MotorcycleChild) motorcycle;
            motorcycleChild.motorcycleSpecialAction();
        }
    }
}
