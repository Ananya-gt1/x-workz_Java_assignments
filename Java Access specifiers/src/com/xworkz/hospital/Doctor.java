package com.xworkz.hospital;

public class Doctor {
        public String doctorName;
        String specialization;
        private double salary;

        public Doctor(String doctorName, String specialization, double salary) {
            this.doctorName = doctorName;
            this.specialization = specialization;
            this.salary = salary;
        }

        void displayDoctor() {
            System.out.println("Display the doctor details:");
            System.out.println("Doctor Name: " + doctorName);
            System.out.println("Specialization: " + specialization);
            System.out.println("Salary: " + salary);
            System.out.println("..............................................");
        }
    }


