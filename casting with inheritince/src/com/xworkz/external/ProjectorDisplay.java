package com.xworkz.external;

import com.xworkz.internal.Projector;
import com.xworkz.internal.ProjectorChild;

public class ProjectorDisplay {
    public void display(Projector projector) {
        projector.project();
        projector.focus();
        projector.zoom();
        projector.adjustBrightness();
        projector.connect();
        
        if (projector instanceof ProjectorChild) {
            ProjectorChild projectorChild = (ProjectorChild) projector;
            projectorChild.projectorSpecialAction();
        }
    }
}
