package com.xworkz.external;

import com.xworkz.internal.Vase;
import com.xworkz.internal.VaseChild;

public class VaseDisplay {
    public void display(Vase vase) {
        vase.holdFlowers();
        vase.fillWater();
        vase.clean();
        vase.decorate();
        vase.place();
        
        if (vase instanceof VaseChild) {
            VaseChild vaseChild = (VaseChild) vase;
            vaseChild.vaseSpecialAction();
        }
    }
}
