package com.xworkz.hospital;

public class Hospital {

        Doctor doctor;
        Patient patient;
        public String hospitalName;
        private String location;
        int totalBeds;

        public Hospital(String hospitalName, String location, int totalBeds, Doctor doctor, Patient patient) {
            this.hospitalName = hospitalName;
            this.location = location;
            this.totalBeds = totalBeds;
            this.doctor = doctor;
            this.patient = patient;
        }

        public void displayHospital() {
            System.out.println("Dispaly hospital details:");
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Location: " + location);
            System.out.println("Total Beds: " + totalBeds);
            System.out.println("..............................................");

            if (doctor != null) {
                doctor.displayDoctor();
            } else {
                System.out.println("No Doctor assigned.");
            }

            if (patient != null) {
                patient.showPatient();
            } else {
                System.out.println("No Patient assigned.");
            }
        }
    }

