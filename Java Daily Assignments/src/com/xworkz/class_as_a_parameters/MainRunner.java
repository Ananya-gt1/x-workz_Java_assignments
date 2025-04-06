package com.xworks.class_as_a_parameters;



public class MainRunner {
    public static void main(String[] args) {
        Shop shop=new Shop();
        Display display=new Display();
        shop.ads(display);

        Poster poster=new Poster();
        Theater theater=new Theater();
        theater.show(poster);

        Rcb rcb=new Rcb();
        IplTeam iplTeam=new IplTeam();
        iplTeam.team(rcb);

        SpaceCraft spaceCraft=new SpaceCraft();
        Astronaut astronaut=new Astronaut();
        spaceCraft.joyStick(astronaut);

        Dolo650 medicine = new Dolo650();
        Fever fever=new Fever();
        medicine.take(fever);

        Barber barber = new Barber();
        Haircut haircut=new Haircut();
        barber.giveHaircut(haircut);

        Camera camera = new Camera();
        Photo photo=new Photo();
        camera.click(photo);

        Mango mango = new Mango();
        Tree tree=new Tree();
        mango.ripen(tree);

        Pillow pillow = new Pillow();
        Sleep sleep=new Sleep();
        pillow.support(sleep);



    }
}
