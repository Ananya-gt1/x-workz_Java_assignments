package com.xworkz.restaurant;

public class Manager {

        public float salary;
        String managerName; // default access (package-private)
        private int members;

        public Manager(float salary, String managerName, int members) {
            this.salary = salary;
            this.managerName = managerName;
            this.members = members;
        }

        // Default method (can be accessed within the same package)
        void displayManager() {
            System.out.println("Display the Manager Details:");
            System.out.println("Manager Name: " + managerName);
            System.out.println("Manager Salary: " + salary);
            System.out.println("Number of Team Members: " + members);
        }
    }


