package com.xworks.class_as_a_parameters;

class Dolo650 {
    void take(Fever fever) {
        if (fever != null) {
            fever.cure();
        } else {
            System.out.println("No fever detected.");
        }
    }
}