package com.xworkz.external;

import com.xworkz.internal.Mirror;
import com.xworkz.internal.MirrorChild;

public class MirrorDisplay {
    public void display(Mirror mirror) {
        mirror.reflect();
        mirror.clean();
        mirror.hang();
        mirror.adjustAngle();
        mirror.install();
        
        if (mirror instanceof MirrorChild) {
            MirrorChild mirrorChild = (MirrorChild) mirror;
            mirrorChild.mirrorSpecialAction();
        }
    }
}
