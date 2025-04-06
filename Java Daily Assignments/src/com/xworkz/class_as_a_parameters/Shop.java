package com.xworks.class_as_a_parameters;

public class Shop {
    void ads(Display display){
        if(display !=null){
            display.run();
        }
        else {
            System.out.printf("disply is null");
        }
    }



}
