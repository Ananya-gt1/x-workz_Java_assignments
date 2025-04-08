package com.xworkz.external;

import com.xworkz.internal.Mug;
import com.xworkz.internal.MugChild;

public class MugDisplay {
    public void display(Mug mug) {
        mug.pour();
        mug.drink();
        mug.fill();
        mug.clean();
        mug.hold();
        
        if (mug instanceof MugChild) {
            MugChild mugChild = (MugChild) mug;
            mugChild.mugSpecialAction();
        }
    }
}
