package com.xworkz.ananya.dto;

import java.io.Serializable;

public class RgisterDTO implements Serializable {

        private String nameName;
        private double moblieNoName;
        private String emailName;
        private String passwordName;

    public RgisterDTO(String nameName, double moblieNoName, String emailName, String passwordName) {
        this.nameName = nameName;
        this.moblieNoName = moblieNoName;
        this.emailName = emailName;
        this.passwordName = passwordName;
    }

    public String getNameName() {
        return nameName;
    }

    public void setNameName(String nameName) {
        this.nameName = nameName;
    }

    public double getMoblieNoName() {
        return moblieNoName;
    }

    public void setMoblieNoName(double moblieNoName) {
        this.moblieNoName = moblieNoName;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getPasswordName() {
        return passwordName;
    }

    public void setPasswordName(String passwordName) {
        this.passwordName = passwordName;
    }

    @Override
    public String toString() {
        return "RgisterDTO{" +
                "nameName='" + nameName + '\'' +
                ", moblieNoName='" + moblieNoName + '\'' +
                ", emailName='" + emailName + '\'' +
                ", passwordName='" + passwordName + '\'' +
                '}';
    }
}
