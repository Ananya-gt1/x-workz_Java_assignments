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

        Vehicle vehicle1=new Car();
        vehicle1.buy();
        vehicle1.horn();
        vehicle1.stop();
        vehicle1.start();
        vehicle1.capacity();

        Vehicle vehicle2 = new Bike();
        vehicle2.buy();
        vehicle2.horn();
        vehicle2.stop();
        vehicle2.start();
        vehicle2.capacity();

        Vehicle vehicle3 = new Bus();
        vehicle3.buy();
        vehicle3.horn();
        vehicle3.stop();
        vehicle3.start();
        vehicle3.capacity();

        Vehicle vehicle4 = new Truck();
        vehicle4.buy();
        vehicle4.horn();
        vehicle4.stop();
        vehicle4.start();
        vehicle4.capacity();

        Vehicle vehicle5 = new Tractor();
        vehicle5.buy();
        vehicle5.horn();
        vehicle5.stop();
        vehicle5.start();
        vehicle5.capacity();

        Vehicle vehicle6 = new Train();
        vehicle6.buy();
        vehicle6.horn();
        vehicle6.stop();
        vehicle6.start();
        vehicle6.capacity();

        Vehicle vehicle7 = new Ship();
        vehicle7.buy();
        vehicle7.horn();
        vehicle7.stop();
        vehicle7.start();
        vehicle7.capacity();

        Vehicle vehicle8 = new Bicycle();
        vehicle8.buy();
        vehicle8.horn();
        vehicle8.stop();
        vehicle8.start();
        vehicle8.capacity();

        Vehicle vehicle9 = new Rocket();
        vehicle9.buy();
        vehicle9.horn();
        vehicle9.stop();
        vehicle9.start();
        vehicle9.capacity();

        Vehicle vehicle10 = new Helicopter();
        vehicle10.buy();
        vehicle10.horn();
        vehicle10.stop();
        vehicle10.start();
        vehicle10.capacity();
    }
}
