package com.xworkz.bank;

public class Customer {

        private String customerName;
         int age;
         public String customerStatus;
        Account account;

        public Customer(String customerName, int age, Account account,String customerStatus) {
            this.customerName = customerName;
            this.customerStatus=customerStatus;
            this.age = age;
            this.account = account;
        }


        void displayCustomer() {
            System.out.println("Display the customer details:");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Age: " + age);
            System.out.println("Customer Status: " + customerStatus);
            System.out.println("...........................................");

            if (account != null) {
                account.displayAccount();
            } else {
                System.out.println("No Bank Account Assigned.");
            }
        }
    }

