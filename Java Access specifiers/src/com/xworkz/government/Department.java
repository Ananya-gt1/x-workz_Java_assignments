package com.xworkz.government;

public class Department {
        public String departmentName;
        String DepartStatus;
        private int numberOfEmployees;
        Officer officer;

        public Department(String departmentName, int numberOfEmployees,  String getDepartStatus,Officer officer) {
            this.departmentName = departmentName;
            this.numberOfEmployees = numberOfEmployees;
            this.DepartStatus=DepartStatus;
            this.officer = officer;
        }

        void displayDepartment() {
            System.out.println("Display the department details:");
            System.out.println("Department Name: " + departmentName);
            System.out.println("Number of Employees: " + numberOfEmployees);
            System.out.println("Department Status:"+DepartStatus);
            System.out.println(".................................................");

            if (officer != null) {
                officer.displayOfficer();
            } else {
                System.out.println("No Officer Assigned.");
            }
        }
    }

