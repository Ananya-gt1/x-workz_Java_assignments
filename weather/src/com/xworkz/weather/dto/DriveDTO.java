package com.xworkz.weather.dto;

import java.io.Serializable;

public class DriveDTO implements Serializable {
    private String name;
    private String address;
    private String mobileNo;
    private String appliedDate;
    private String vehicleType;

    public DriveDTO(String name, String address, String mobileNo, String appliedDate, String vehicleType) {
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.appliedDate = appliedDate;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "DriveDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", appliedDate='" + appliedDate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
