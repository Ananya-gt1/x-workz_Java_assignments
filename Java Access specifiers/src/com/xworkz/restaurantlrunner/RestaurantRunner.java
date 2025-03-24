package com.xworkz.restaurantlrunner;

import com.xworkz.restaurant.Customer;
import com.xworkz.restaurant.Manager;
import com.xworkz.restaurant.Restaurant;

public class RestaurantRunner {
    public static void main(String[] args) {
        Manager manager = new Manager(50000, "Ananya", 50);

        Customer customer = new Customer("Shriharsha", 25, 400);

        Restaurant restaurant = new Restaurant("Sarva Cafe", 456, "Karnataka", manager, customer);

        restaurant.displayRestaurant();
    }

}
