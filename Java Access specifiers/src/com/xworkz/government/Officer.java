package com.xworkz.government;

public class Officer {

        private String officerName;
        public String position;
        double salary;

        public Officer(String officerName, String position, double salary) {
            this.officerName = officerName;
            this.position = position;
            this.salary = salary;
        }

        // Private method to show officer details
        private void showOfficerDetails() {
            System.out.println("Officer Name: " + officerName);
            System.out.println("Position: " + position);
            System.out.println("Salary: ₹" + salary);
        }

        // Public method to display officer details
        public void displayOfficer() {
            System.out.println("Displaying Officer Details:");
            showOfficerDetails();
        }
    }


