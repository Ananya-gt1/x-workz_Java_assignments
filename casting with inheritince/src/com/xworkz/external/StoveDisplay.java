package com.xworkz.external;

import com.xworkz.internal.Stove;
import com.xworkz.internal.StoveChild;

public class StoveDisplay {
    public void display(Stove stove) {
        stove.ignite();
        stove.adjustFlame();
        stove.turnOff();
        stove.cook();
        stove.clean();
        
        if (stove instanceof StoveChild) {
            StoveChild stoveChild = (StoveChild) stove;
            stoveChild.stoveSpecialAction();
        }
    }
}
