package com.xworkz.external;

import com.xworkz.internal.Lamp;
import com.xworkz.internal.LampChild;

public class LampDisplay {
    public void display(Lamp lamp) {
        lamp.turnOn();
        lamp.turnOff();
        lamp.adjustBrightness();
        lamp.changeBulb();
        lamp.plugIn();
        
        if (lamp instanceof LampChild) {
            LampChild lampChild = (LampChild) lamp;
            lampChild.lampSpecialAction();
        }
    }
}
