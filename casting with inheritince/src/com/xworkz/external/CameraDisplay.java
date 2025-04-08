package com.xworkz.external;

import com.xworkz.internal.Camera;
import com.xworkz.internal.CameraChild;

public class CameraDisplay {
    public void display(Camera camera) {
        camera.takePhoto();
        camera.recordVideo();
        camera.zoomIn();
        camera.zoomOut();
        camera.switchLens();
        
        if (camera instanceof CameraChild) {
            CameraChild cameraChild = (CameraChild) camera;
            cameraChild.cameraSpecialAction();
        }
    }
}
