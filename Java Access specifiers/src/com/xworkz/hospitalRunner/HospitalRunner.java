package com.xworkz.hospitalRunner;

import com.xworkz.hospital.Doctor;
import com.xworkz.hospital.Hospital;
import com.xworkz.hospital.Patient;

public class HospitalRunner {
        public static void main(String[] args) {
            Doctor doctor = new Doctor("Dr. Ananya", "Cardiologist", 100000);

            Patient patient = new Patient("Shri", 30, "Heart Disease");

            Hospital hospital = new Hospital("Apollo Hospital", "Bangalore", 200, doctor, patient);

            hospital.displayHospital();
        }
    }


