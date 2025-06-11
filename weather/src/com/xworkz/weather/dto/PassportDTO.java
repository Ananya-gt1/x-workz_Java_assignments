package com.xworkz.weather.dto;

import java.io.Serializable;

public class PassportDTO implements Serializable {
    private String name;
    private String adharNo;
    private String address;
    private String panNo;
    private String state;
    private String city;
    private String pincode;
    private String passportType;
    private String payment;

    public PassportDTO(String name, String adharNo, String address, String panNo, String state, String city, String pincode, String passportType, String payment) {
        this.name = name;
        this.adharNo = adharNo;
        this.address = address;
        this.panNo = panNo;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.passportType = passportType;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "PassportDTO{" +
                "name='" + name + '\'' +
                ", adharNo='" + adharNo + '\'' +
                ", address='" + address + '\'' +
                ", panNo='" + panNo + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", passportType='" + passportType + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}
