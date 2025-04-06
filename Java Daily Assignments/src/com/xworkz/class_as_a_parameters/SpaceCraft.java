package com.xworks.class_as_a_parameters;

public class SpaceCraft {
    void joyStick(Astronaut astronaut){
        if(astronaut !=null){
            astronaut.space();
        }
        else {
            System.out.printf("null function");
        }

    }
}
