package com.xworkz.external;

import com.xworkz.internal.Bed;
import com.xworkz.internal.Durofex;

public class BedDisplay {
    public void display(Bed bed){
        bed.makeBed();
        bed.sit();
        bed.adjustPosition();
        bed.clean();
        bed.sleep();

        if (bed instanceof Durofex){
            System.out.println("bed is a durofex");
            Durofex durofex=(Durofex) bed;
            durofex.bedSpecialAction();
        }
    }
}
