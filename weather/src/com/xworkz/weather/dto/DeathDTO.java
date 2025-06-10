package com.xworkz.weather.dto;

import java.io.Serializable;

public class DeathDTO implements Serializable {

    private String name;
    private String cause;
    private String date;
    private String time;
    private String ageAtDeath;
    private String certifiedBy;
    private String hospitalName;
    private String mannerOfDeath;
    private String gender;
    private String marks;

    public DeathDTO(String name, String cause, String date, String time, String ageAtDeath, String certifiedBy, String hospitalName, String mannerOfDeath, String gender, String marks) {
        this.name = name;
        this.cause = cause;
        this.date = date;
        this.time = time;
        this.ageAtDeath = ageAtDeath;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath = mannerOfDeath;
        this.gender = gender;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAgeAtDeath() {
        return ageAtDeath;
    }

    public void setAgeAtDeath(String ageAtDeath) {
        this.ageAtDeath = ageAtDeath;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public void setCertifiedBy(String certifiedBy) {
        this.certifiedBy = certifiedBy;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public void setMannerOfDeath(String mannerOfDeath) {
        this.mannerOfDeath = mannerOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "DeathDTO{" +
                "name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", ageAtDeath='" + ageAtDeath + '\'' +
                ", certifiedBy='" + certifiedBy + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", mannerOfDeath='" + mannerOfDeath + '\'' +
                ", gender='" + gender + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}
