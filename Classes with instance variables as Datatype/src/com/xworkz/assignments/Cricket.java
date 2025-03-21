package com.xworkz.assignments;

public class Cricket {
    Ticket ticket;

    Cricket(Ticket ticket){
        this.ticket=ticket;
    }
    void watch(){
        ticket.buy();
        System.out.println("Watching Cricket Martch");
    }
    void profit(){
        ticket.sell();
        System.out.println("Made profit from selling");
    }
}
