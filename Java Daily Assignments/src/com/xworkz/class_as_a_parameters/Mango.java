package com.xworks.class_as_a_parameters;

class Mango {
    void ripen(Tree tree) {
        if (tree != null) {
            tree.grow();
        } else {
            System.out.println("No tree for mangoes.");
        }
    }
}

