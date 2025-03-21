package com.xworkz.assignments;

import org.omg.CORBA.SystemException;

public class Ticket {
    TicketType type;
    double cost;

    Ticket(TicketType type,double cost){
        this.type=type;
        this.cost=cost;
    }
    void buy(){
        System.out.println("Ticket brought:"+this.type+"for the cost of:"+this.cost);
    }
    void sell(){
        System.out.println("Ticket brought:"+this.type+"for the cost of:"+this.cost);
    }
}
