package com.xworkz.hospital;

public class Patient {
        private String patientName;
        private int age;
        private String disease;

        public Patient(String patientName, int age, String disease) {
            this.patientName = patientName;
            this.age = age;
            this.disease = disease;
        }

        private void showPatientDetails() {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Age: " + age);
            System.out.println("Disease: " + disease);
        }

        public void showPatient() {
            System.out.println("Displaying Patient Details:");
            showPatientDetails();
        }
    }

