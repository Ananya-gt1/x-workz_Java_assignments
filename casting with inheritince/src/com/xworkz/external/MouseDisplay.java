package com.xworkz.external;

import com.xworkz.internal.Mouse;
import com.xworkz.internal.MouseChild;

public class MouseDisplay {
    public void display(Mouse mouse) {
        mouse.click();
        mouse.scroll();
        mouse.move();
        mouse.connect();
        mouse.doubleClick();
        
        if (mouse instanceof MouseChild) {
            MouseChild mouseChild = (MouseChild) mouse;
            mouseChild.mouseSpecialAction();
        }
    }
}
