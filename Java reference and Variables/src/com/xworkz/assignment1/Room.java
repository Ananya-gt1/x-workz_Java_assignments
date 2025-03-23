package com.xworkz.assignment1;

public class Room {
    int roomNo;
    String roomType;
    public Room(String roomType, int roomNo){
        this.roomNo=roomNo;
        this.roomType=roomType;
    }
    void roomDisplay(){
        System.out.println("Room no "+this.roomNo);
        System.out.println("Room type "+this.roomType);
    }
}
