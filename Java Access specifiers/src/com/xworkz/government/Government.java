package com.xworkz.government;

public class Government {

        private String governmentType;
        String country;
        public  String governmentName;
        Department department;

        public Government(String governmentType, String country, String governmentName,Department department) {
            this.governmentType = governmentType;
            this.country = country;
            this.governmentName=governmentName;
            this.department = department;
        }

        public void displayGovernment() {
            System.out.println("Display the government details:");
            System.out.println("Government Type: " + governmentType);
            System.out.println("Country: " + country);
            System.out.println("Government Name:"+governmentName);
            System.out.println("..............................................");

            if (department != null) {
                department.displayDepartment();
            } else {
                System.out.println("No Department Available.");
            }
        }
    }


