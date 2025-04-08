package com.xworkz.external;

import com.xworkz.internal.Umbrella;
import com.xworkz.internal.UmbrellaChild;

public class UmbrellaDisplay {
    public void display(Umbrella umbrella) {
        umbrella.open();
        umbrella.close();
        umbrella.hold();
        umbrella.dry();
        umbrella.store();
        
        if (umbrella instanceof UmbrellaChild) {
            UmbrellaChild umbrellaChild = (UmbrellaChild) umbrella;
            umbrellaChild.umbrellaSpecialAction();
        }
    }
}
