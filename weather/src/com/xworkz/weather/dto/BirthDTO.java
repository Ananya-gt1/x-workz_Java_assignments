package com.xworkz.weather.dto;
import java.io.Serializable;

public class BirthDTO implements Serializable {

    private String birthName;
    private String fatherName;
    private String motherName;
    private String doctorName;
    private String nurseName;
    private String hospitalName;
    private String hospitalType;

    public BirthDTO(){}
    public BirthDTO(String birthName, String fatherName, String motherName, String doctorName, String nurseName, String hospitalName, String hospitalType) {
        this.birthName = birthName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
        this.hospitalName = hospitalName;
        this.hospitalType = hospitalType;
    }

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

    @Override
    public String toString() {
        return "BirthDTO{" +
                "birthName='" + birthName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalType='" + hospitalType + '\'' +
                '}';
    }
}
