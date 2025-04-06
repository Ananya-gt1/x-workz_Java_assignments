package com.xworks.class_as_a_parameters;

class Pillow {
    void support(Sleep sleep) {
        if (sleep != null) {
            sleep.rest();
        } else {
            System.out.println("No sleep without a pillow.");
        }
    }
}