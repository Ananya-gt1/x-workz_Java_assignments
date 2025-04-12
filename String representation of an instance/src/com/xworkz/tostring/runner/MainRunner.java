package com.xworkz.tostring.runner;

import com.xworkz.tostring.internal.*;

public class MainRunner {

    public static void main(String[] args) {

        AirForce airForce1 = new AirForce("India", 1700, "Air Chief Marshal V. R. Chaudhari");
        AirForce airForce2=new AirForce("Russia",3456,"Modi");
        System.out.println(airForce1);
        System.out.println(airForce2);
        System.out.println("The Air force are: "+airForce1.equals(airForce2));
        System.out.println(airForce1.hashCode());


        Airplane airplane1 = new Airplane("Air India", 180, true);
        Airplane airplane2=new Airplane("USA Plane",456,true);
        System.out.println(airplane1);
        System.out.println(airplane2);
        System.out.println("The Instances are:"+airplane1.equals(airplane2));
        System.out.println(airplane1.hashCode());

        Army army1 = new Army("India", 1200000, "General Manoj Pande");
        Army army2=new Army("USA",7865,"Kiran Raj");
        System.out.println(army1);
        System.out.println(army2);
        System.out.println(army1.hashCode());
        System.out.println("The Instance are:"+army1.equals(army2));


        AsianPaint asianPaint1 = new AsianPaint("Asian Paints", "Blue", 1200);
       AsianPaint asianPaint2=new AsianPaint("Paint","Black",456);
        String paintRepresentation = asianPaint1.toString();
        System.out.println(paintRepresentation);
        System.out.println(asianPaint1.hashCode());
        System.out.println(asianPaint1.equals(asianPaint2));


        Asteroid asteroid1 = new Asteroid("Ceres", 939.4, "Carbonaceous");
        Asteroid asteroid2= new Asteroid("Sirus",456.8,"Stone");
        System.out.println(asteroid1);
        System.out.println(asteroid1.hashCode());
        System.out.println(asteroid1.equals(asteroid2));


        Astronaut astronaut1 = new Astronaut("Rakesh Sharma", 1, "ISRO");
        Astronaut astronaut2= new Astronaut("Sirus",345,"Stone");
        System.out.println(astronaut1);
        System.out.println(astronaut1.hashCode());
        System.out.println(astronaut1.equals(astronaut2));


        AutoRickshaw autoRickshaw1 = new AutoRickshaw("Bajaj RE", false, 15);
        System.out.println(autoRickshaw1);
        System.out.println(autoRickshaw1.hashCode());
        AutoRickshaw autoRickshaw2=new AutoRickshaw("Yamaha",true,12);
        System.out.println(autoRickshaw1.equals(autoRickshaw2));


        BergerPaints bergerPaints1 = new BergerPaints("Mint Green", "Satin", 20);
        System.out.println(bergerPaints1);
        System.out.println(bergerPaints1.hashCode());
        BergerPaints bergerPaints2=new BergerPaints("Light Green","satin",6);
        System.out.println(autoRickshaw1.equals(autoRickshaw2));


        Bike bike1 = new Bike("Yamaha", 150, false);
        System.out.println(bike1);
        System.out.println(bike1.hashCode());
        Bike bike2=new Bike("Bajaj",250,true);
        System.out.println(bike1.equals(bike2));

        Biology biology1 = new Biology("Zoology", true, 25);
        System.out.println(biology1);
        System.out.println(biology1.hashCode());
        Biology biology2=new Biology("Zoology",true,25);
        System.out.println(biology2);


        Biriyani biriyani1 = new Biriyani("Hyderabadi", "Hyderabad", true);
        System.out.println(biriyani1);
        System.out.println(biriyani1.hashCode());
        Biriyani biriyani2=new Biriyani("Hyderabadi","Andra",false);



        Yajamana yajamana=new Yajamana("Darshan",1.75,2.50f);
        String representationOfYajamaString=yajamana.toString();
        System.out.println(representationOfYajamaString);

        int intYajama=yajamana.hashCode();
        System.out.println(intYajama);

        Cat cat=new Cat("Whisky","White",4500);
        String catRepresentation=cat.toString();
        System.out.println(catRepresentation);

        int intCat=cat.hashCode();
        System.out.println(intCat);

        Car car = new Car("Swift", "City", 1200000);
        String vehicleRepresentation = car.toString();
        System.out.println(vehicleRepresentation);

        int Car=car.hashCode();
        System.out.println(car);

        Lion animal = new Lion("Lion", "Forest", 15);
        String animalRepresentation = animal.toString();
        System.out.println(animalRepresentation);

        int intAnimal=car.hashCode();
        System.out.println(intAnimal);

        Earbuds gadget = new Earbuds("EarBud", "Noise", 5000);
        String gadgetRepresentation = gadget.toString();
        System.out.println(gadgetRepresentation);

        int intGadget=car.hashCode();
        System.out.println(intGadget);

        LG tv = new LG("LG", "LED", 38000);
        String tvRepresentation = tv.toString();
        System.out.println(tvRepresentation);

        int intTv=car.hashCode();
        System.out.println(intTv);

        WingsofFire book = new WingsofFire("Wings of Fire", "A.P.J. Abdul Kalam", 350);
        String bookRepresentation = book.toString();
        System.out.println(bookRepresentation);

        int intBook=car.hashCode();
        System.out.println(intBook);

        CityCareHospital hospital = new CityCareHospital("CityCare Hospital", "Bangalore", 250);
        System.out.println(hospital);

        int intHospital=car.hashCode();
        System.out.println(intHospital);

        HelpingHands ngo = new HelpingHands("Helping Hands", "Mangalore", 120);
        System.out.println(ngo);

        int intNgo=car.hashCode();
        System.out.println(intNgo);

        Java course = new Java("Java Programming", "Mr. Ravi Kumar", 8);
        System.out.println(course);
        System.out.println(course.hashCode());

        Maths maths = new Maths("Mathematics", "Mrs. Kavya", 12);
        System.out.println(maths);
        System.out.println(maths.hashCode());

        Ramayana ramayana = new Ramayana("Valmiki", "Lord Rama", 500);
        System.out.println(ramayana);
        System.out.println(ramayana.hashCode());

        MahaBharatha mahabharatha = new MahaBharatha("Vyasa", "Lord Krishna", 100000);
        System.out.println(mahabharatha);
        System.out.println(mahabharatha.hashCode());

        ITIndustry itIndustry = new ITIndustry("Infosys", "Bangalore", 250000);
        System.out.println(itIndustry);
        System.out.println(itIndustry.hashCode());

        FilmIndustry filmIndustry = new FilmIndustry("Bollywood", "Mumbai", 200);
        System.out.println(filmIndustry);
        System.out.println(filmIndustry.hashCode());

        Mystery mystery = new Mystery("The Hidden Key", "Agatha Roy", 20);
        System.out.println(mystery);
        System.out.println(mystery.hashCode());

        Thriller thriller = new Thriller("Dark Chase", "Neil D'Souza", 9);
        System.out.println(thriller);
        System.out.println(thriller.hashCode());

        Poetry poetry = new Poetry("Whispers of the Wind", "Maya Sen", "Free Verse");
        System.out.println(poetry);
        System.out.println(poetry.hashCode());

        ShortStory shortStory = new ShortStory("The Last Leaf", "O. Henry", 5);
        System.out.println(shortStory);
        System.out.println(shortStory.hashCode());

        ShortPoem shortPoem = new ShortPoem("Dewdrop Dream", "Ananya G T", 4);
        System.out.println(shortPoem);
        System.out.println(shortPoem.hashCode());

        Planet earth = new Planet("Earth", 5.972e24, true);
        System.out.println(earth);
        System.out.println(earth.hashCode());

        Star sun = new Star("Sun", 1.0, "Main Sequence");
        System.out.println(sun);
        System.out.println(sun.hashCode());





        Scientist scientist = new Scientist("Dr. C.V. Raman", "Physics", 12);
        System.out.println(scientist);
        System.out.println(scientist.hashCode());

        Military soldier = new Military("Arjun Singh", "Captain", "Indian Army - Infantry");
        System.out.println(soldier);
        System.out.println(soldier.hashCode());


        Navy navy = new Navy("India", 150, "Admiral R. Hari Kumar");
        System.out.println(navy);
        System.out.println(navy.hashCode());


        CoastGuard coastGuard = new CoastGuard("India", 60, "DG Rakesh Pal");
        System.out.println(coastGuard);
        System.out.println(coastGuard.hashCode());

        Shiva shiva = new Shiva("Lord Shiva", "Trident (Trishul)", "Nandi the Bull", "Parvati");
        System.out.println(shiva);
        System.out.println(shiva.hashCode());


        Parvathi parvathi = new Parvathi("Parvati", "Shiva", "Shakti", "Lion or Tiger");
        System.out.println(parvathi);
        System.out.println(parvathi.hashCode());

        ShriRama shriRama = new ShriRama("Shri Rama", "Sita", "Kodanda", "Ayodhya");
        System.out.println(shriRama);
        System.out.println(shriRama.hashCode());

        Sita sita = new Sita("Sita", "Shri Rama", "Janakpur", "Purity and Devotion");
        System.out.println(sita);
        System.out.println(sita.hashCode());

        Brahma brahma = new Brahma("Brahma", 4, "Swan (Hamsa)", "Saraswati");
        System.out.println(brahma);
        System.out.println(brahma.hashCode());

        Durga durga = new Durga("Durga", "Trident, Sword, and more", "Tiger", "Slayer of Mahishasura");
        System.out.println(durga);
        System.out.println(durga.hashCode());

        Hero hero = new Hero("Yash", 38, "Jambada Hudugi", "Rocky Bhai in KGF");
        System.out.println(hero);
        System.out.println(hero.hashCode());

        Heroine heroine = new Heroine("Rashmika Mandanna", 28, "Kirik Party", "Srivalli in Pushpa");
        System.out.println(heroine);
        System.out.println(heroine.hashCode());

        Comedian comedian = new Comedian("Sadhu Kokila", 57, "Fast-talking humor & expressions", "Apthamitra");
        System.out.println(comedian);
        System.out.println(comedian.hashCode());

        Stuntman stuntman = new Stuntman("Ravi Varma", 45, "Bike stunts and high falls", "KGF Chapter 2");
        System.out.println(stuntman);
        System.out.println(stuntman.hashCode());

        FightMaster fightMaster = new FightMaster("Anbariv", 40, "Raw hand-to-hand combat & action choreography", "Vikram");
        System.out.println(fightMaster);
        System.out.println(fightMaster.hashCode());

        Musician musician = new Musician("Devi Sri Prasad", 44, "Music Composition & Singing", "Pushpa: The Rise");
        System.out.println(musician);
        System.out.println(musician.hashCode());

        Singer singer = new Singer("Arijit Singh", 36, "Romantic & Soulful", "Tum Hi Ho");
        System.out.println(singer);
        System.out.println(singer.hashCode());

        Villain villain = new Villain("Sanjay Dutt", 65, "Intense stare & powerful voice", "Adheera in KGF Chapter 2");
        System.out.println(villain);
        System.out.println(villain.hashCode());

        Director director = new Director("Prashanth Neel", 43, "Dark tone & massy storytelling", "KGF Series");
        System.out.println(director);
        System.out.println(director.hashCode());

        Producer producer = new Producer("Vijay Kiragandur", 50, "Hombale Films", "KGF Chapter 2");
        System.out.println(producer);
        System.out.println(producer.hashCode());



        FishMeals coastalFish = new FishMeals("King Fish", "Mangalore", true);
        System.out.println(coastalFish);
        System.out.println(coastalFish.hashCode());

        ChickenMeals chicken65 = new ChickenMeals("Chicken 65", "South Indian", false);
        System.out.println(chicken65);
        System.out.println(chicken65.hashCode());

        Palav vegPalav = new Palav("Karnataka Style", "Basmati Rice", true);
        System.out.println(vegPalav);
        System.out.println(vegPalav.hashCode());

        Dog labrador = new Dog("Labrador Retriever", "Golden", 3);
        System.out.println(labrador);
        System.out.println(labrador.hashCode());

        Cow girCow = new Cow("Gir", "White with brown patches", true);
        System.out.println(girCow);
        System.out.println(girCow.hashCode());

        Ox hallikarOx = new Ox("Hallikar", "Gray", true);
        System.out.println(hallikarOx);
        System.out.println(hallikarOx.hashCode());

        Buffalo murrah = new Buffalo("Murrah", 10.5, true);
        System.out.println(murrah);
        System.out.println(murrah.hashCode());

        Tiger bengalTiger = new Tiger("Bengal Tiger", "Sundarbans", true);
        System.out.println(bengalTiger);
        System.out.println(bengalTiger.hashCode());

        Cheetah africanCheetah = new Cheetah(120.0, "Africa", true);
        System.out.println(africanCheetah);
        System.out.println(africanCheetah.hashCode());

        Leopard indianLeopard = new Leopard("Forests & Hills", true, "Rosette-shaped");
        System.out.println(indianLeopard);
        System.out.println(indianLeopard.hashCode());

        Elephant asianElephant = new Elephant("Asian Elephant", 1.8, true);
        System.out.println(asianElephant);
        System.out.println(asianElephant.hashCode());

        Crocodile mugger = new Crocodile("Freshwater", 4.2, true);
        System.out.println(mugger);
        System.out.println(mugger.hashCode());

        Jaguar amazonJaguar = new Jaguar("Amazon Rainforest", true, 1500);
        System.out.println(amazonJaguar);
        System.out.println(amazonJaguar.hashCode());

        Rhinoceros indianRhino = new Rhinoceros("Indian Rhinoceros", 1, true);
        System.out.println(indianRhino);
        System.out.println(indianRhino.hashCode());

        Raccoon rocky = new Raccoon(true, true, "Fruits & Nuts");
        System.out.println(rocky);
        System.out.println(rocky.hashCode());

        Python indianRockPython = new Python("Indian Rock Python", 5.2, false);
        System.out.println(indianRockPython);
        System.out.println(indianRockPython.hashCode());

        RotiCurry lunch = new RotiCurry("Paneer Butter Masala", 3, true);
        System.out.println(lunch);
        System.out.println(lunch.hashCode());

        History indianHistory = new History("Medieval India", "Shivaji", false);
        System.out.println(indianHistory);
        System.out.println(indianHistory.hashCode());

        Chemistry chem = new Chemistry("Inorganic", true, 12);
        System.out.println(chem);
        System.out.println(chem.hashCode());



        Economics eco = new Economics("Macroeconomics", true, 8);
        System.out.println(eco);
        System.out.println(eco.hashCode());

        PoliticalScience politics = new PoliticalScience("Democracy", true, 6);
        System.out.println(politics);
        System.out.println(politics.hashCode());

        Geography geo = new Geography("Physical", true, 10);
        System.out.println(geo);
        System.out.println(geo.hashCode());

        Physics physics = new Physics("Mechanics", true, 15);
        System.out.println(physics);
        System.out.println(physics.hashCode());

        English eng = new English("Poetry", true, 14);
        System.out.println(eng);
        System.out.println(eng.hashCode());

        NipponPaint paint = new NipponPaint("Sky Blue", "Matte", 10);
        System.out.println(paint);
        System.out.println(paint.hashCode());



        DuluxPaints dulux = new DuluxPaints("Lavender", "Eggshell", 15);
        System.out.println(dulux);
        System.out.println(dulux.hashCode());

        IndigoPaints indigo = new IndigoPaints("Ocean Blue", "Glossy", 5);
        System.out.println(indigo);
        System.out.println(indigo.hashCode());

        JSWPaints jsw = new JSWPaints("Terracotta", "Matte", 10);
        System.out.println(jsw);
        System.out.println(jsw.hashCode());

        ShalimarPaints shalimar = new ShalimarPaints("Ivory", "Satin", 7);
        System.out.println(shalimar);
        System.out.println(shalimar.hashCode());

        KansaiNerolac kansai = new KansaiNerolac("Peach", "Satin", 4);
        System.out.println(kansai);
        System.out.println(kansai.hashCode());

        BritishPaints british = new BritishPaints("Coral Red", "Glossy", 8);
        System.out.println(british);
        System.out.println(british.hashCode());

        SnowcemPaints snowcem = new SnowcemPaints("Pure White", "Matte", 12);
        System.out.println(snowcem);
        System.out.println(snowcem.hashCode());

        SonyTV sony = new SonyTV(55, true, "4K UHD");
        System.out.println(sony);
        System.out.println(sony.hashCode());

        SamsungTV samsung = new SamsungTV(50, true, "Full HD");
        System.out.println(samsung);
        System.out.println(samsung.hashCode());

        PanasonicTV panasonic = new PanasonicTV(49, true, "4K UHD");
        System.out.println(panasonic);
        System.out.println(panasonic.hashCode());

        TCLTV tcl = new TCLTV(40, false, "Full HD");
        System.out.println(tcl);
        System.out.println(tcl.hashCode());

        OnePlusTV oneplus = new OnePlusTV(65, true, "4K QLED");
        System.out.println(oneplus);
        System.out.println(oneplus.hashCode());

        RealmeTV realme = new RealmeTV(43, true, "Full HD");
        System.out.println(realme);
        System.out.println(realme.hashCode());

        VizioTV vizio = new VizioTV(55, true, "4K UHD");
        System.out.println(vizio);
        System.out.println(vizio.hashCode());



        Truck truck = new Truck("Tata", 10, true);
        System.out.println(truck);
        System.out.println(truck.hashCode());

        Bus bus = new Bus("KSRTC", 52, true);
        System.out.println(bus);
        System.out.println(bus.hashCode());



        Scooter scooter = new Scooter("Ather", true, 80);
        System.out.println(scooter);
        System.out.println(scooter.hashCode());

        Tractor tractor = new Tractor("Mahindra", 45, true);
        System.out.println(tractor);
        System.out.println(tractor.hashCode());


        Boat boat = new Boat("Motorboat", 6, true);
        System.out.println(boat);
        System.out.println(boat.hashCode());

        Helicopter heli = new Helicopter("Apache", 4, true);
        System.out.println(heli);
        System.out.println(heli.hashCode());

        Train train = new Train("Shatabdi Express", 20, true);
        System.out.println(train);
        System.out.println(train.hashCode());

        Spaceship ship = new Spaceship("SpaceX Starship", 100, true);
        System.out.println(ship);
        System.out.println(ship.hashCode());
    }
}
