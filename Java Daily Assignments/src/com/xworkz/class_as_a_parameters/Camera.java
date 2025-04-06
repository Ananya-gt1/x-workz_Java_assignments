package com.xworks.class_as_a_parameters;

class Camera {
    void click(Photo photo) {
        if (photo != null) {
            photo.capture();
        } else {
            System.out.println("No photo to capture.");
        }
    }
}
