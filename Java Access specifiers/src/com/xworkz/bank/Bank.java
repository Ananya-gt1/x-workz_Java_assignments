package com.xworkz.bank;

public class Bank {
        private String bankName;
        public  String branch;
        String location;
        Customer customer;

        public Bank(String bankName, String location,String branch, Customer customer) {
            this.bankName = bankName;
            this.location = location;
            this.customer = customer;
            this.branch=branch;
        }

        public void displayBank() {
            System.out.println("Display the bank details:");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Location: " + location);
            System.out.println("Branch: " + branch);
            System.out.println("...........................................");

            if (customer != null) {
                customer.displayCustomer();
            } else {
                System.out.println("No Customers Available.");
            }
        }
    }


