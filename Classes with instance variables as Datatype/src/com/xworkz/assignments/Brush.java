package com.xworkz.assignments;

public class Brush {
    BrushColor color;

    Brush(BrushColor color){
        this.color=color;
    }
    void clean(){
        System.out.println("Cleaning with brush of color:"+color);
    }
    void scrub(){
        System.out.println("Scrubbing with brush of color:"+color);
    }
}
