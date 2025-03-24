package com.xworkz.restaurant;

public class Restaurant {

        Manager manager;
        Customer customer;
        public String name;
        float pricePerDay;
        private String location;

        public Restaurant(String name, float pricePerDay, String location, Manager manager, Customer customer) {
            this.name = name;
            this.pricePerDay = pricePerDay;
            this.location = location;
            this.manager = manager;
            this.customer = customer;
        }

        public void displayRestaurant() {
            System.out.println("Display the Restaurant Details:");
            System.out.println("Restaurant Name: " + name);
            System.out.println("Price Per Day: " + pricePerDay);
            System.out.println("Location: " + location);

            if (manager != null) {
                manager.displayManager();
            } else {
                System.out.println("No Manager assigned.");
            }

            if (customer != null) {
                customer.showCustomer(); // Calls the public method, which calls the private method internally
            } else {
                System.out.println("No Customer assigned.");
            }
        }
    }

