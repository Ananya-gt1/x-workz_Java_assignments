package com.xworks.class_as_a_parameters;

class Rocket {
    void launch(Fuel fuel) {
        if (fuel != null) {
            fuel.burn();
        } else {
            System.out.println("No fuel available for launch.");
        }
    }
}