package com.xworkz.external;

import com.xworkz.internal.Chair;
import com.xworkz.internal.ChairChild;

public class ChairDisplay {
    public void display(Chair chair) {
        chair.sit();
        chair.adjustHeight();
        chair.recline();
        chair.rotate();
        chair.fold();
        
        if (chair instanceof ChairChild) {
            ChairChild chairChild = (ChairChild) chair;
            chairChild.chairSpecialAction();
        }
    }
}
