package com.xworkz.external;

import com.xworkz.internal.Oven;
import com.xworkz.internal.OvenChild;

public class OvenDisplay {
    public void display(Oven oven) {
        oven.bake();
        oven.preheat();
        oven.setTimer();
        oven.broil();
        oven.clean();
        
        if (oven instanceof OvenChild) {
            OvenChild ovenChild = (OvenChild) oven;
            ovenChild.ovenSpecialAction();
        }
    }
}
