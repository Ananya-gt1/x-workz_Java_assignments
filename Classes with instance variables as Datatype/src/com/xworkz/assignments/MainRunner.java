package com.xworkz.assignments;

public class MainRunner {
    public static void main(String[] args) {

        String color = "Purple";
        Clip clip=new Clip(color);
        Pushpa pushpa= new Pushpa(clip);
        Clip[] clips = {
                new Clip("Red"),
                new Clip("Yellow"),
                new Clip("Blue"),
                new Clip("Orange"),
                new Clip("Yellow")
        };

        pushpa.useClips(clips);



        Ticket ticket=new Ticket(TicketType.GOLD,230);
        Cricket cricket=new Cricket(ticket);

        Brush brush=new Brush(BrushColor.BLACK);

        Virat virat=new Virat(brush,clips,ticket,cricket);

        System.out.println("Virat is playing:");
        virat.play();

        System.out.println("Virat is cleaning:");
        virat.clean();

        System.out.println("Virat is relaxing:");
        virat.relax();
    }
}
