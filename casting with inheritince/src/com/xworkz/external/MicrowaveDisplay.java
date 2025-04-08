package com.xworkz.external;

import com.xworkz.internal.Microwave;
import com.xworkz.internal.MicrowaveChild;

public class MicrowaveDisplay {
    public void display(Microwave microwave) {
        microwave.heat();
        microwave.defrost();
        microwave.setTimer();
        microwave.openDoor();
        microwave.closeDoor();
        
        if (microwave instanceof MicrowaveChild) {
            MicrowaveChild microwaveChild = (MicrowaveChild) microwave;
            microwaveChild.microwaveSpecialAction();
        }
    }
}
