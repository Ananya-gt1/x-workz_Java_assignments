package com.xworkz.runner;

import com.xworkz.internal.*;

public class VehicleRunner {
    public static void main(String[] args) {
        Bus bus=new Bus();
        bus.start();
        bus.stop();
        bus.buy();
        bus.horn();
        bus.capacity();

        Truck truck = new Truck();
        truck.stop();
        truck.capacity();
        truck.start();
        truck.horn();
        truck.buy();

        Car car=new Car();
        car.start();
        car.capacity();
        car.buy();
        car.horn();
        car.stop();

        Bike bike=new Bike();
        bike.capacity();
        bike.horn();
        bike.start();
        bike.buy();
        bike.stop();

        Train train = new Train();
        train.start();
        train.capacity();
        train.buy();
        train.horn();
        train.stop();

        Ship ship = new Ship();
        ship.start();
        ship.capacity();
        ship.buy();
        ship.horn();
        ship.stop();

        Helicopter helicopter = new Helicopter();
        helicopter.start();
        helicopter.capacity();
        helicopter.buy();
        helicopter.horn();
        helicopter.stop();

        Rocket rocket = new Rocket();
        rocket.start();
        rocket.capacity();
        rocket.buy();
        rocket.horn();
        rocket.stop();

        Tractor tractor = new Tractor();
        tractor.start();
        tractor.capacity();
        tractor.buy();
        tractor.horn();
        tractor.stop();

        Bicycle bicycle = new Bicycle();
        bicycle.start();
        bicycle.capacity();
        bicycle.buy();
        bicycle.horn();
        bicycle.stop();
    }
}
