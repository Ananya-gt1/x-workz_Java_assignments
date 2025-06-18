package com.xworkz.ananya.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable {
    private String nameName;
    private String passwordName;

    public LoginDTO(String nameName, String passwordName) {
        this.nameName = nameName;
        this.passwordName = passwordName;
    }

    public String getNameName() {
        return nameName;
    }

    public void setNameName(String nameName) {
        this.nameName = nameName;
    }

    public String getPasswordName() {
        return passwordName;
    }

    public void setPasswordName(String passwordName) {
        this.passwordName = passwordName;
    }

    @Override
    public String toString() {
        return "loginDto{" +
                "nameName='" + nameName + '\'' +
                ", passwordName='" + passwordName + '\'' +
                '}';
    }
}
