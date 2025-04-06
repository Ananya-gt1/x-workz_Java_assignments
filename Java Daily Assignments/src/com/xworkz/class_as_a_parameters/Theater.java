package com.xworks.class_as_a_parameters;

class Theater {
    void show(Poster poster) {
        if (poster != null) {
            poster.showInfo();
        } else {
            System.out.println("No poster available.");
        }
    }
}

