package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.internal.*;

public class MainRunner {
    public static void main(String[] args) {

        Paints paints=new Paints();

        Bike bike=new Bike("Enfield",2.30,"Banglore");
        bike.displayBike();

        Car car=new Car();
        car.driving();
        car.chasing();

        Movie movie=new Movie("Upendra","Shreya","Upendra",250000);
        movie.displayMovie();

        Blank blank=new Blank();
        blank.planning();
    }
}
