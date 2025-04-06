package com.xworks.class_as_a_parameters;

class Barber {
    void giveHaircut(Haircut haircut) {
        if (haircut != null) {
            haircut.cut();
        } else {
            System.out.println("No haircut requested.");
        }
    }
}