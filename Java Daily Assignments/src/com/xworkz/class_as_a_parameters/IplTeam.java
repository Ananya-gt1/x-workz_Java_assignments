package com.xworks.class_as_a_parameters;

public class IplTeam {
    void team(Rcb rcb){
        if(rcb !=null){
            rcb.virat();
        }
        else {
            System.out.printf("null");
        }
    }
}
