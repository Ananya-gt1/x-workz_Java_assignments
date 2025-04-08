package com.xworkz.external;

import com.xworkz.internal.Car;
import com.xworkz.internal.CarChild;

public class CarDisplay {
    public void display(Car car) {
        car.drive();
        car.brake();
        car.accelerate();
        car.turn();
        car.honk();
        
        if (car instanceof CarChild) {
            CarChild carChild = (CarChild) car;
            carChild.carSpecialAction();
        }
    }
}
