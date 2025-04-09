package com.xworkz.tostring.runner;

import com.xworkz.tostring.internal.*;

public class MainRunner {

    public static void main(String[] args) {
        Yajamana yajamana=new Yajamana("Darshan",1.75,2.50f);
        String representationOfYajamaString=yajamana.toString();
        System.out.println(representationOfYajamaString);

        Cat cat=new Cat("Whisky","White",4500);
        String catRepresentation=cat.toString();
        System.out.println(catRepresentation);

        AsianPaint asianPaint = new AsianPaint("Asian Paints", "Blue", 1200);
        String paintRepresentation = asianPaint.toString();
        System.out.println(paintRepresentation);

        Car car = new Car("Swift", "City", 1200000);
        String vehicleRepresentation = car.toString();
        System.out.println(vehicleRepresentation);

        Lion animal = new Lion("Lion", "Forest", 15);
        String animalRepresentation = animal.toString();
        System.out.println(animalRepresentation);

        Earbuds gadget = new Earbuds("EarBud", "Noise", 5000);
        String gadgetRepresentation = gadget.toString();
        System.out.println(gadgetRepresentation);

        LG tv = new LG("LG", "LED", 38000);
        String tvRepresentation = tv.toString();
        System.out.println(tvRepresentation);

        WingsofFire book = new WingsofFire("Wings of Fire", "A.P.J. Abdul Kalam", 350);
        String bookRepresentation = book.toString();
        System.out.println(bookRepresentation);

        CityCareHospital hospital = new CityCareHospital("CityCare Hospital", "Bangalore", 250);
        System.out.println(hospital);

        HelpingHands ngo = new HelpingHands("Helping Hands", "Mangalore", 120);
        System.out.println(ngo);

        Java course = new Java("Java Programming", "Mr. Ravi Kumar", 8);
        System.out.println(course);

        Maths maths = new Maths("Mathematics", "Mrs. Kavya", 12);
        System.out.println(maths);

        Ramayana ramayana = new Ramayana("Valmiki", "Lord Rama", 500);
        System.out.println(ramayana);

        MahaBharatha mahabharatha = new MahaBharatha("Vyasa", "Lord Krishna", 100000);
        System.out.println(mahabharatha);

        ITIndustry itIndustry = new ITIndustry("Infosys", "Bangalore", 250000);
        System.out.println(itIndustry);

        FilmIndustry filmIndustry = new FilmIndustry("Bollywood", "Mumbai", 200);
        System.out.println(filmIndustry);

        Mystery mystery = new Mystery("The Hidden Key", "Agatha Roy", 20);
        System.out.println(mystery);

        Thriller thriller = new Thriller("Dark Chase", "Neil D'Souza", 9);
        System.out.println(thriller);

        Poetry poetry = new Poetry("Whispers of the Wind", "Maya Sen", "Free Verse");
        System.out.println(poetry);

        ShortStory shortStory = new ShortStory("The Last Leaf", "O. Henry", 5);
        System.out.println(shortStory);

        ShortPoem shortPoem = new ShortPoem("Dewdrop Dream", "Ananya G T", 4);
        System.out.println(shortPoem);

        Planet earth = new Planet("Earth", 5.972e24, true);
        System.out.println(earth);

        Star sun = new Star("Sun", 1.0, "Main Sequence");
        System.out.println(sun);

        Asteroid asteroid = new Asteroid("Ceres", 939.4, "Carbonaceous");
        System.out.println(asteroid);

        Astronaut astronaut = new Astronaut("Rakesh Sharma", 1, "ISRO");
        System.out.println(astronaut);

        Scientist scientist = new Scientist("Dr. C.V. Raman", "Physics", 12);
        System.out.println(scientist);

        Military soldier = new Military("Arjun Singh", "Captain", "Indian Army - Infantry");
        System.out.println(soldier);

        Army indianArmy = new Army("India", 1200000, "General Manoj Pande");
        System.out.println(indianArmy);

        Navy navy = new Navy("India", 150, "Admiral R. Hari Kumar");
        System.out.println(navy);

        AirForce airForce = new AirForce("India", 1700, "Air Chief Marshal V. R. Chaudhari");
        System.out.println(airForce);

        CoastGuard coastGuard = new CoastGuard("India", 60, "DG Rakesh Pal");
        System.out.println(coastGuard);

        Shiva shiva = new Shiva("Lord Shiva", "Trident (Trishul)", "Nandi the Bull", "Parvati");
        System.out.println(shiva);

        Parvathi parvathi = new Parvathi("Parvati", "Shiva", "Shakti", "Lion or Tiger");
        System.out.println(parvathi);

        ShriRama shriRama = new ShriRama("Shri Rama", "Sita", "Kodanda", "Ayodhya");
        System.out.println(shriRama);

        Sita sita = new Sita("Sita", "Shri Rama", "Janakpur", "Purity and Devotion");
        System.out.println(sita);

        Brahma brahma = new Brahma("Brahma", 4, "Swan (Hamsa)", "Saraswati");
        System.out.println(brahma);

        Durga durga = new Durga("Durga", "Trident, Sword, and more", "Tiger", "Slayer of Mahishasura");
        System.out.println(durga);

        Hero hero = new Hero("Yash", 38, "Jambada Hudugi", "Rocky Bhai in KGF");
        System.out.println(hero);

        Heroine heroine = new Heroine("Rashmika Mandanna", 28, "Kirik Party", "Srivalli in Pushpa");
        System.out.println(heroine);

        Comedian comedian = new Comedian("Sadhu Kokila", 57, "Fast-talking humor & expressions", "Apthamitra");
        System.out.println(comedian);

        Stuntman stuntman = new Stuntman("Ravi Varma", 45, "Bike stunts and high falls", "KGF Chapter 2");
        System.out.println(stuntman);

        FightMaster fightMaster = new FightMaster("Anbariv", 40, "Raw hand-to-hand combat & action choreography", "Vikram");
        System.out.println(fightMaster);

        Musician musician = new Musician("Devi Sri Prasad", 44, "Music Composition & Singing", "Pushpa: The Rise");
        System.out.println(musician);

        Singer singer = new Singer("Arijit Singh", 36, "Romantic & Soulful", "Tum Hi Ho");
        System.out.println(singer);

        Villain villain = new Villain("Sanjay Dutt", 65, "Intense stare & powerful voice", "Adheera in KGF Chapter 2");
        System.out.println(villain);

        Director director = new Director("Prashanth Neel", 43, "Dark tone & massy storytelling", "KGF Series");
        System.out.println(director);

        Producer producer = new Producer("Vijay Kiragandur", 50, "Hombale Films", "KGF Chapter 2");
        System.out.println(producer);

        Biriyani hyderabadiBiriyani = new Biriyani("Hyderabadi", "Hyderabad", true);
        System.out.println(hyderabadiBiriyani);

        FishMeals coastalFish = new FishMeals("King Fish", "Mangalore", true);
        System.out.println(coastalFish);

        ChickenMeals chicken65 = new ChickenMeals("Chicken 65", "South Indian", false);
        System.out.println(chicken65);

        Palav vegPalav = new Palav("Karnataka Style", "Basmati Rice", true);
        System.out.println(vegPalav);

        Dog labrador = new Dog("Labrador Retriever", "Golden", 3);
        System.out.println(labrador);

        Cow girCow = new Cow("Gir", "White with brown patches", true);
        System.out.println(girCow);

        Ox hallikarOx = new Ox("Hallikar", "Gray", true);
        System.out.println(hallikarOx);

        Buffalo murrah = new Buffalo("Murrah", 10.5, true);
        System.out.println(murrah);

        Tiger bengalTiger = new Tiger("Bengal Tiger", "Sundarbans", true);
        System.out.println(bengalTiger);

        Cheetah africanCheetah = new Cheetah(120.0, "Africa", true);
        System.out.println(africanCheetah);

        Leopard indianLeopard = new Leopard("Forests & Hills", true, "Rosette-shaped");
        System.out.println(indianLeopard);

        Elephant asianElephant = new Elephant("Asian Elephant", 1.8, true);
        System.out.println(asianElephant);

        Crocodile mugger = new Crocodile("Freshwater", 4.2, true);
        System.out.println(mugger);

        Jaguar amazonJaguar = new Jaguar("Amazon Rainforest", true, 1500);
        System.out.println(amazonJaguar);

        Rhinoceros indianRhino = new Rhinoceros("Indian Rhinoceros", 1, true);
        System.out.println(indianRhino);

        Raccoon rocky = new Raccoon(true, true, "Fruits & Nuts");
        System.out.println(rocky);

        Python indianRockPython = new Python("Indian Rock Python", 5.2, false);
        System.out.println(indianRockPython);

        RotiCurry lunch = new RotiCurry("Paneer Butter Masala", 3, true);
        System.out.println(lunch);

        History indianHistory = new History("Medieval India", "Shivaji", false);
        System.out.println(indianHistory);

        Chemistry chem = new Chemistry("Inorganic", true, 12);
        System.out.println(chem);

        Biology bio = new Biology("Zoology", true, 25);
        System.out.println(bio);

        Economics eco = new Economics("Macroeconomics", true, 8);
        System.out.println(eco);

        PoliticalScience politics = new PoliticalScience("Democracy", true, 6);
        System.out.println(politics);

        Geography geo = new Geography("Physical", true, 10);
        System.out.println(geo);

        Physics physics = new Physics("Mechanics", true, 15);
        System.out.println(physics);

        English eng = new English("Poetry", true, 14);
        System.out.println(eng);

        NipponPaint paint = new NipponPaint("Sky Blue", "Matte", 10);
        System.out.println(paint);

        BergerPaints berger = new BergerPaints("Mint Green", "Satin", 20);
        System.out.println(berger);

        DuluxPaints dulux = new DuluxPaints("Lavender", "Eggshell", 15);
        System.out.println(dulux);

        IndigoPaints indigo = new IndigoPaints("Ocean Blue", "Glossy", 5);
        System.out.println(indigo);

        JSWPaints jsw = new JSWPaints("Terracotta", "Matte", 10);
        System.out.println(jsw);

        ShalimarPaints shalimar = new ShalimarPaints("Ivory", "Satin", 7);
        System.out.println(shalimar);

        KansaiNerolac kansai = new KansaiNerolac("Peach", "Satin", 4);
        System.out.println(kansai);

        BritishPaints british = new BritishPaints("Coral Red", "Glossy", 8);
        System.out.println(british);

        SnowcemPaints snowcem = new SnowcemPaints("Pure White", "Matte", 12);
        System.out.println(snowcem);

        SonyTV sony = new SonyTV(55, true, "4K UHD");
        System.out.println(sony);

        SamsungTV samsung = new SamsungTV(50, true, "Full HD");
        System.out.println(samsung);

        PanasonicTV panasonic = new PanasonicTV(49, true, "4K UHD");
        System.out.println(panasonic);

        TCLTV tcl = new TCLTV(40, false, "Full HD");
        System.out.println(tcl);

        OnePlusTV oneplus = new OnePlusTV(65, true, "4K QLED");
        System.out.println(oneplus);

        RealmeTV realme = new RealmeTV(43, true, "Full HD");
        System.out.println(realme);

        VizioTV vizio = new VizioTV(55, true, "4K UHD");
        System.out.println(vizio);

        Bike bike = new Bike("Yamaha", 150, false);
        System.out.println(bike);

        Truck truck = new Truck("Tata", 10, true);
        System.out.println(truck);

        Bus bus = new Bus("KSRTC", 52, true);
        System.out.println(bus);

        AutoRickshaw auto = new AutoRickshaw("Bajaj RE", false, 15);
        System.out.println(auto);

        Scooter scooter = new Scooter("Ather", true, 80);
        System.out.println(scooter);

        Tractor tractor = new Tractor("Mahindra", 45, true);
        System.out.println(tractor);

        Airplane airplane = new Airplane("Air India", 180, true);
        System.out.println(airplane);

        Boat boat = new Boat("Motorboat", 6, true);
        System.out.println(boat);

        Helicopter heli = new Helicopter("Apache", 4, true);
        System.out.println(heli);

        Train train = new Train("Shatabdi Express", 20, true);
        System.out.println(train);

        Spaceship ship = new Spaceship("SpaceX Starship", 100, true);
        System.out.println(ship);
    }
}
