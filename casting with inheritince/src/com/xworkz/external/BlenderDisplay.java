package com.xworkz.external;

import com.xworkz.internal.Blender;
import com.xworkz.internal.BlenderChild;

public class BlenderDisplay {
    public void display(Blender blender) {
        blender.blend();
        blender.chop();
        blender.pulse();
        blender.pour();
        blender.clean();
        
        if (blender instanceof BlenderChild) {
            BlenderChild blenderChild = (BlenderChild) blender;
            blenderChild.blenderSpecialAction();
        }
    }
}
