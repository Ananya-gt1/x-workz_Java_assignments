package com.xworkz.external;

import com.xworkz.internal.Fan;
import com.xworkz.internal.FanChild;

public class FanDisplay {
    public void display(Fan fan) {
        fan.turnOn();
        fan.turnOff();
        fan.adjustSpeed();
        fan.oscillate();
        fan.clean();
        
        if (fan instanceof FanChild) {
            FanChild fanChild = (FanChild) fan;
            fanChild.fanSpecialAction();
        }
    }
}
