package com.xworkz.external;

import com.xworkz.internal.Brush;
import com.xworkz.internal.BrushChild;

public class BrushDisplay {
    public void display(Brush brush) {
        brush.paint();
        brush.dip();
        brush.clean();
        brush.stroke();
        brush.store();
        
        if (brush instanceof BrushChild) {
            BrushChild brushChild = (BrushChild) brush;
            brushChild.brushSpecialAction();
        }
    }
}
