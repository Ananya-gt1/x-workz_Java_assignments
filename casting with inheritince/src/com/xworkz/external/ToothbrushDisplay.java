package com.xworkz.external;

import com.xworkz.internal.Toothbrush;
import com.xworkz.internal.ToothbrushChild;

public class ToothbrushDisplay {
    public void display(Toothbrush toothbrush) {
        toothbrush.brushTeeth();
        toothbrush.rinse();
        toothbrush.replaceHead();
        toothbrush.store();
        toothbrush.clean();
        
        if (toothbrush instanceof ToothbrushChild) {
            ToothbrushChild toothbrushChild = (ToothbrushChild) toothbrush;
            toothbrushChild.toothbrushSpecialAction();
        }
    }
}
