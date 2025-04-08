package com.xworkz.external;

import com.xworkz.internal.Pen;
import com.xworkz.internal.PenChild;

public class PenDisplay {
    public void display(Pen pen) {
        pen.write();
        pen.draw();
        pen.click();
        pen.refill();
        pen.cap();
        
        if (pen instanceof PenChild) {
            PenChild penChild = (PenChild) pen;
            penChild.penSpecialAction();
        }
    }
}
