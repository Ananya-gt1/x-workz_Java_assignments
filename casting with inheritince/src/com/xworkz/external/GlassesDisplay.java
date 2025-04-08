package com.xworkz.external;

import com.xworkz.internal.Glasses;
import com.xworkz.internal.GlassesChild;

public class GlassesDisplay {
    public void display(Glasses glasses) {
        glasses.wear();
        glasses.clean();
        glasses.remove();
        glasses.adjust();
        glasses.store();
        
        if (glasses instanceof GlassesChild) {
            GlassesChild glassesChild = (GlassesChild) glasses;
            glassesChild.glassesSpecialAction();
        }
    }
}
