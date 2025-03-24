package com.xworkz.restaurant;

public class Customer {
        public String customerName;
         int age;
        private float totalBill;

        public Customer(String customerName, int age, float totalBill) {
            this.customerName = customerName;
            this.age = age;
            this.totalBill = totalBill;
        }

        private void showCustomerDetails() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Age: " + age);
            System.out.println("Total Bill Amount: " + totalBill);
        }

        public void showCustomer() {
            System.out.println("Displaying Customer Details:");
            showCustomerDetails();
        }
    }
