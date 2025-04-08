package com.xworkz.external;

import com.xworkz.internal.Bottle;
import com.xworkz.internal.BottleChild;

public class BottleDisplay {
    public void display(Bottle bottle) {
        bottle.fill();
        bottle.pour();
        bottle.openCap();
        bottle.closeCap();
        bottle.shake();
        
        if (bottle instanceof BottleChild) {
            BottleChild bottleChild = (BottleChild) bottle;
            bottleChild.bottleSpecialAction();
        }
    }
}
