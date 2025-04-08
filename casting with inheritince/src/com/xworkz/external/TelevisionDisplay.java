package com.xworkz.external;

import com.xworkz.internal.Television;
import com.xworkz.internal.TelevisionChild;

public class TelevisionDisplay {
    public void display(Television television) {
        television.turnOn();
        television.turnOff();
        television.changeChannel();
        television.increaseVolume();
        television.mute();
        
        if (television instanceof TelevisionChild) {
            TelevisionChild televisionChild = (TelevisionChild) television;
            televisionChild.televisionSpecialAction();
        }
    }
}
