package com.xworkz.insect.dto;

import java.io.Serializable;

public class PgDTO implements Serializable {

    private String nameName;
    private String occupationName;
    private String fatherName;
    private String motherName;
    private String dateOfBirthName;
    private String addressName;
    private String checkBoxName;

    public PgDTO(String nameName, String occupationName, String fatherName, String motherName, String dateOfBirthName, String addressName, String checkBoxName) {
        this.nameName = nameName;
        this.occupationName = occupationName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateOfBirthName = dateOfBirthName;
        this.addressName = addressName;
        this.checkBoxName = checkBoxName;
    }

    public String getNameName() {
        return nameName;
    }

    public void setNameName(String nameName) {
        this.nameName = nameName;
    }

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
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

    public String getDateOfBirthName() {
        return dateOfBirthName;
    }

    public void setDateOfBirthName(String dateOfBirthName) {
        this.dateOfBirthName = dateOfBirthName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getCheckBoxName() {
        return checkBoxName;
    }

    public void setCheckBoxName(String checkBoxName) {
        this.checkBoxName = checkBoxName;
    }

    @Override
    public String toString() {
        return "PgDTO{" +
                "nameName='" + nameName + '\'' +
                ", occupationName='" + occupationName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", dateOfBirthName='" + dateOfBirthName + '\'' +
                ", addressName='" + addressName + '\'' +
                ", checkBoxName='" + checkBoxName + '\'' +
                '}';
    }
}
