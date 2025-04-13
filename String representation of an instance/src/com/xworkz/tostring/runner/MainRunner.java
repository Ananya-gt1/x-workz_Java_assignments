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

     Boat boat1 = new Boat("Motorboat", 6, true);
     Boat boat2 = new Boat("Motorboat", 6, true);
     System.out.println(boat1);
     System.out.println(boat1.hashCode());
     System.out.println(boat1.equals(boat2));

     Brahma brahma1 = new Brahma("Brahma", 4, "Swan (Hamsa)", "Saraswati");
     System.out.println(brahma1);
     System.out.println(brahma1.hashCode());
     Brahma brahma2 = new Brahma("Brahma", 4, "Swan (Hamsa)", "Saraswati");
     System.out.println(brahma1.equals(brahma2));

     BritishPaints britishPaints1 = new BritishPaints("Coral Red", "Glossy", 8);
     System.out.println(britishPaints1);
     System.out.println(britishPaints1.hashCode());
     BritishPaints britishPaints2 = new BritishPaints("Coral Red", "Glossy", 8);
     System.out.println(britishPaints1.equals(britishPaints2));

     Buffalo buffalo1 = new Buffalo("Murrah", 10.5, true);
     System.out.println(buffalo1);
     System.out.println(buffalo1.hashCode());
     Buffalo buffalo2 = new Buffalo("Murrah", 10.5, true);
     System.out.println(buffalo1.equals(buffalo2));

     Bus bus1 = new Bus("KSRTC", 52, true);
     Bus bus2 = new Bus("KSRTC", 52, true);
     System.out.println(bus1);
     System.out.println(bus1.hashCode());
     System.out.println(bus1.equals(bus2));

        Car car1 = new Car("Swift", "City", 1200000);
        Car car2 = new Car("Swift", "City", 1200000);
        String vehicleRepresentation = car1.toString();
        System.out.println(vehicleRepresentation);
        int Car=car1.hashCode();
        System.out.println(car1);
        System.out.println(car1.equals(car2));

     Cat cat1=new Cat("Whisky","White",4500);
     Cat cat2=new Cat("Whisky","White",4500);
     String catRepresentation=cat1.toString();
     System.out.println(catRepresentation);
     int intCat=cat1.hashCode();
     System.out.println(intCat);
     System.out.println(cat1.equals(cat2));

     Cheetah cheetah1 = new Cheetah(120.0, "Africa", true);
     System.out.println(cheetah1);
     System.out.println(cheetah1.hashCode());
     Cheetah cheetah2 = new Cheetah(120.0, "Africa", true);
     System.out.println(cheetah1.equals(cheetah2));

     Chemistry chemistry1 = new Chemistry("Inorganic", true, 12);
     System.out.println(chemistry1);
     System.out.println(chemistry1.hashCode());
     Chemistry chemistry2 = new Chemistry("Inorganic", true, 12);
     System.out.println(chemistry1.equals(chemistry2));

     ChickenMeals chickenMeals1 = new ChickenMeals("Chicken 65", "South Indian", false);
     System.out.println(chickenMeals1);
     System.out.println(chickenMeals1.hashCode());
     ChickenMeals chickenMeals2 = new ChickenMeals("Chicken 65", "South Indian", false);
     System.out.println(chickenMeals1.equals(chickenMeals2));

     CityCareHospital hospital1 = new CityCareHospital("CityCare Hospital", "Bangalore", 250);
     CityCareHospital hospital2 = new CityCareHospital("CityCare Hospital", "Bangalore", 250);
     System.out.println(hospital1);
     int intHospital=hospital1.hashCode();
     System.out.println(intHospital);
     System.out.println(hospital1.equals(hospital2));

     CoastGuard coastGuard1 = new CoastGuard("India", 60, "DG Rakesh Pal");
     System.out.println(coastGuard1);
     System.out.println(coastGuard1.hashCode());
     CoastGuard coastGuard2 = new CoastGuard("India", 60, "DG Rakesh Pal");
     System.out.println(coastGuard1.equals(coastGuard2));

     Comedian comedian1 = new Comedian("Sadhu Kokila", 57, "Fast-talking humor & expressions", "Apthamitra");
     System.out.println(comedian1);
     System.out.println(comedian1.hashCode());
     Comedian comedian2 = new Comedian("Sadhu Kokila", 57, "Fast-talking humor & expressions", "Apthamitra");
     System.out.println(comedian1.equals(comedian2));

     Cow cow1 = new Cow("Gir", "White with brown patches", true);
     System.out.println(cow1);
     System.out.println(cow1.hashCode());
     Cow cow2 = new Cow("Gir", "White with brown patches", true);
     System.out.println(cow1.equals(cow2));

     Crocodile crocodile1 = new Crocodile("Freshwater", 4.2, true);
     System.out.println(crocodile1);
     System.out.println(crocodile1.hashCode());
     Crocodile crocodile2 = new Crocodile("Freshwater", 4.2, true);
     System.out.println(crocodile1.equals(crocodile2));

     Director director1 = new Director("Prashanth Neel", 43, "Dark tone & massy storytelling", "KGF Series");
     System.out.println(director1);
     System.out.println(director1.hashCode());
     Director director2 = new Director("Prashanth Neel", 43, "Dark tone & massy storytelling", "KGF Series");
     System.out.println(director1.equals(director2));

     Dog dog1 = new Dog("Labrador Retriever", "Golden", 3);
     System.out.println(dog1);
     System.out.println(dog1.hashCode());
     Dog dog2 = new Dog("Labrador Retriever", "Golden", 3);
     System.out.println(dog1.equals(dog2));

     DuluxPaints duluxPaints1 = new DuluxPaints("Lavender", "Eggshell", 15);
     System.out.println(duluxPaints1);
     System.out.println(duluxPaints1.hashCode());
     DuluxPaints duluxPaints2 = new DuluxPaints("Lavender", "Eggshell", 15);
     System.out.println(duluxPaints1.equals(duluxPaints2));

     Durga durga1 = new Durga("Durga", "Trident, Sword, and more", "Tiger", "Slayer of Mahishasura");
     System.out.println(durga1);
     System.out.println(durga1.hashCode());
     Durga durga2 = new Durga("Durga", "Trident, Sword, and more", "Tiger", "Slayer of Mahishasura");
     System.out.println(durga1.equals(durga2));

     Earbuds earbuds1 = new Earbuds("EarBud", "Noise", 5000);
     Earbuds earbuds2 = new Earbuds("EarBud", "Noise", 5000);
     String gadgetRepresentation = earbuds2.toString();
     System.out.println(gadgetRepresentation);
     int intGadget=earbuds1.hashCode();
     System.out.println(intGadget);
     System.out.println(earbuds1.equals(earbuds2));

     Economics economics1 = new Economics("Macroeconomics", true, 8);
     System.out.println(economics1);
     System.out.println(economics1.hashCode());
     Economics economics2 = new Economics("Macroeconomics", true, 8);
     System.out.println(economics1.equals(economics2));

     Elephant elephant1 = new Elephant("Asian Elephant", 1.8, true);
     System.out.println(elephant1);
     System.out.println(elephant1.hashCode());
     Elephant elephant2 = new Elephant("Asian Elephant", 1.8, true);
     System.out.println(elephant1.equals(elephant2));

     English english1 = new English("Poetry", true, 14);
     System.out.println(english1);
     System.out.println(english1.hashCode());
     English english2 = new English("Poetry", true, 14);
     System.out.println(english1.equals(english2));

     FightMaster fightMaster1 = new FightMaster("Anbariv", 40, "Raw hand-to-hand combat & action choreography", "Vikram");
     System.out.println(fightMaster1);
     System.out.println(fightMaster1.hashCode());
     FightMaster fightMaster2 = new FightMaster("Anbariv", 40, "Raw hand-to-hand combat & action choreography", "Vikram");
     System.out.println(fightMaster1.equals(fightMaster2));

     FilmIndustry filmIndustry1= new FilmIndustry("Bollywood", "Mumbai", 200);
     System.out.println(filmIndustry1);
     System.out.println(filmIndustry1.hashCode());
     FilmIndustry filmIndustry2 = new FilmIndustry("Bollywood", "Mumbai", 200);
     System.out.println(filmIndustry1.equals(filmIndustry2));

     FishMeals coastalFish1 = new FishMeals("King Fish", "Mangalore", true);
     System.out.println(coastalFish1);
     System.out.println(coastalFish1.hashCode());
     FishMeals coastalFish2 = new FishMeals("King Fish", "Mangalore", true);
     System.out.println(coastalFish1.equals(coastalFish2));

     Geography geography1 = new Geography("Physical", true, 10);
     System.out.println(geography1);
     System.out.println(geography1.hashCode());
     Geography geography2 = new Geography("Physical", true, 10);
     System.out.println(geography1.equals(geography2));

     Helicopter helicopter1 = new Helicopter("Apache", 4, true);
     Helicopter helicopter2 = new Helicopter("Apache", 4, true);
     System.out.println(helicopter1);
     System.out.println(helicopter1.hashCode());
     System.out.println(helicopter1.equals(helicopter2));

     HelpingHands helpingHands1 = new HelpingHands("Helping Hands", "Mangalore", 120);
     HelpingHands helpingHands2 = new HelpingHands("Helping Hands", "Mangalore", 120);
     System.out.println(helpingHands1);
     System.out.println(helpingHands1.equals(helpingHands2));
     int intNgo=helpingHands1.hashCode();
     System.out.println(intNgo);















        Lion animal = new Lion("Lion", "Forest", 15);
        String animalRepresentation = animal.toString();
        System.out.println(animalRepresentation);

        int intAnimal=car.hashCode();
        System.out.println(intAnimal);



        LG tv = new LG("LG", "LED", 38000);
        String tvRepresentation = tv.toString();
        System.out.println(tvRepresentation);

        int intTv=car.hashCode();
        System.out.println(intTv);





        Java course = new Java("Java Programming", "Mr. Ravi Kumar", 8);
        System.out.println(course);
        System.out.println(course.hashCode());

        Maths maths = new Maths("Mathematics", "Mrs. Kavya", 12);
        System.out.println(maths);
        System.out.println(maths.hashCode());


        MahaBharatha mahabharatha = new MahaBharatha("Vyasa", "Lord Krishna", 100000);
        System.out.println(mahabharatha);
        System.out.println(mahabharatha.hashCode());

        ITIndustry itIndustry = new ITIndustry("Infosys", "Bangalore", 250000);
        System.out.println(itIndustry);
        System.out.println(itIndustry.hashCode());



        Mystery mystery = new Mystery("The Hidden Key", "Agatha Roy", 20);
        System.out.println(mystery);
        System.out.println(mystery.hashCode());
        Planet earth = new Planet("Earth", 5.972e24, true);
        System.out.println(earth);
        System.out.println(earth.hashCode());


        Poetry poetry = new Poetry("Whispers of the Wind", "Maya Sen", "Free Verse");
        System.out.println(poetry);
        System.out.println(poetry.hashCode());








        Military soldier = new Military("Arjun Singh", "Captain", "Indian Army - Infantry");
        System.out.println(soldier);
        System.out.println(soldier.hashCode());


        Navy navy = new Navy("India", 150, "Admiral R. Hari Kumar");
        System.out.println(navy);
        System.out.println(navy.hashCode());






        Parvathi parvathi = new Parvathi("Parvati", "Shiva", "Shakti", "Lion or Tiger");
        System.out.println(parvathi);
        System.out.println(parvathi.hashCode());




        Hero hero = new Hero("Yash", 38, "Jambada Hudugi", "Rocky Bhai in KGF");
        System.out.println(hero);
        System.out.println(hero.hashCode());

        Heroine heroine = new Heroine("Rashmika Mandanna", 28, "Kirik Party", "Srivalli in Pushpa");
        System.out.println(heroine);
        System.out.println(heroine.hashCode());






        Musician musician = new Musician("Devi Sri Prasad", 44, "Music Composition & Singing", "Pushpa: The Rise");
        System.out.println(musician);
        System.out.println(musician.hashCode());




        Producer producer = new Producer("Vijay Kiragandur", 50, "Hombale Films", "KGF Chapter 2");
        System.out.println(producer);
        System.out.println(producer.hashCode());






     Palav vegPalav = new Palav("Karnataka Style", "Basmati Rice", true);
        System.out.println(vegPalav);
        System.out.println(vegPalav.hashCode());



        Ox hallikarOx = new Ox("Hallikar", "Gray", true);
        System.out.println(hallikarOx);
        System.out.println(hallikarOx.hashCode());




        Leopard indianLeopard = new Leopard("Forests & Hills", true, "Rosette-shaped");
        System.out.println(indianLeopard);
        System.out.println(indianLeopard.hashCode());



        Jaguar amazonJaguar = new Jaguar("Amazon Rainforest", true, 1500);
        System.out.println(amazonJaguar);
        System.out.println(amazonJaguar.hashCode());

        History indianHistory = new History("Medieval India", "Shivaji", false);
        System.out.println(indianHistory);
        System.out.println(indianHistory.hashCode());






        NipponPaint paint = new NipponPaint("Sky Blue", "Matte", 10);
        System.out.println(paint);
        System.out.println(paint.hashCode());





        IndigoPaints indigo = new IndigoPaints("Ocean Blue", "Glossy", 5);
        System.out.println(indigo);
        System.out.println(indigo.hashCode());

        JSWPaints jsw = new JSWPaints("Terracotta", "Matte", 10);
        System.out.println(jsw);
        System.out.println(jsw.hashCode());



        KansaiNerolac kansai = new KansaiNerolac("Peach", "Satin", 4);
        System.out.println(kansai);
        System.out.println(kansai.hashCode());







        PanasonicTV panasonic = new PanasonicTV(49, true, "4K UHD");
        System.out.println(panasonic);
        System.out.println(panasonic.hashCode());



        OnePlusTV oneplus = new OnePlusTV(65, true, "4K QLED");
        System.out.println(oneplus);
        System.out.println(oneplus.hashCode());

        Python indianRockPython = new Python("Indian Rock Python", 5.2, false);
        System.out.println(indianRockPython);
        System.out.println(indianRockPython.hashCode());






        PoliticalScience politics = new PoliticalScience("Democracy", true, 6);
        System.out.println(politics);
        System.out.println(politics.hashCode());


        Physics physics = new Physics("Mechanics", true, 15);
        System.out.println(physics);
        System.out.println(physics.hashCode());

        Raccoon raccoon1 = new Raccoon(true, true, "Fruits & Nuts");
        System.out.println(raccoon1);
        System.out.println(raccoon1.hashCode());
        Raccoon raccoon2 = new Raccoon(true, true, "Fruits & Nuts");
        System.out.println(raccoon1.equals(raccoon2));

        Ramayana ramayana1 = new Ramayana("Valmiki", "Lord Rama", 500);
        System.out.println(ramayana1);
        System.out.println(ramayana1.hashCode());
        Ramayana ramayana2 = new Ramayana("Valmiki", "Lord Rama", 500);
        System.out.println(ramayana1.equals(ramayana2));

        RealmeTV realmeTV1 = new RealmeTV(43, true, "Full HD");
        System.out.println(realmeTV1);
        System.out.println(realmeTV1.hashCode());
        RealmeTV realmeTV2 = new RealmeTV(43, true, "Full HD");
        System.out.println(realmeTV1.equals(realmeTV2));

        Rhinoceros rhinoceros1 = new Rhinoceros("Indian Rhinoceros", 1, true);
        System.out.println(rhinoceros1);
        System.out.println(rhinoceros1.hashCode());
        Rhinoceros rhinoceros2 = new Rhinoceros("Indian Rhinoceros", 1, true);
        System.out.println(rhinoceros1.equals(rhinoceros2));

        RotiCurry rotiCurry1 = new RotiCurry("Paneer Butter Masala", 3, true);
        System.out.println(rotiCurry1);
        System.out.println(rotiCurry1.hashCode());
        RotiCurry rotiCurry2 = new RotiCurry("Paneer Butter Masala", 3, true);
        System.out.println(rotiCurry1.equals(rotiCurry2));

     SamsungTV samsungTV1 = new SamsungTV(50, true, "Full HD");
     System.out.println(samsungTV1);
     System.out.println(samsungTV1.hashCode());
     SamsungTV samsungTV2 = new SamsungTV(50, true, "Full HD");
     System.out.println(samsungTV1.equals(samsungTV2));

        Scientist scientist1 = new Scientist("Dr. C.V. Raman", "Physics", 12);
        System.out.println(scientist1);
        System.out.println(scientist1.hashCode());
        Scientist scientist2 = new Scientist("Dr. C.V. Raman", "Physics", 12);
        System.out.println(scientist1.equals(scientist2));

        Scooter scooter1 = new Scooter("Ather", true, 80);
        System.out.println(scooter1);
        System.out.println(scooter1.hashCode());
     Scooter scooter2 = new Scooter("Ather", true, 80);
     System.out.println(scooter1.equals(scooter2));

        ShalimarPaints shalimarPaints1 = new ShalimarPaints("Ivory", "Satin", 7);
        System.out.println(shalimarPaints1);
        System.out.println(shalimarPaints1.hashCode());
        ShalimarPaints shalimarPaints2 = new ShalimarPaints("Ivory", "Satin", 7);
        System.out.println(shalimarPaints1.equals(shalimarPaints2));

        Shiva shiva1 = new Shiva("Lord Shiva", "Trident (Trishul)", "Nandi the Bull", "Parvati");
        System.out.println(shiva1);
        System.out.println(shiva1.hashCode());
        Shiva shiva2 = new Shiva("Lord Shiva", "Trident (Trishul)", "Nandi the Bull", "Parvati");
        System.out.println(shiva1.equals(shiva2));

        ShortPoem shortPoem1 = new ShortPoem("Dewdrop Dream", "Ananya G T", 4);
        System.out.println(shortPoem1);
        System.out.println(shortPoem1.hashCode());
        ShortPoem shortPoem2 = new ShortPoem("Dewdrop Dream", "Ananya G T", 4);
        System.out.println(shortPoem1.equals(shortPoem2));

        ShortStory shortStory1 = new ShortStory("The Last Leaf", "O. Henry", 5);
        System.out.println(shortStory1);
        System.out.println(shortStory1.hashCode());
        ShortStory shortStory2 = new ShortStory("The Last Leaf", "O. Henry", 5);
        System.out.println(shortStory1.equals(shortStory2));

        ShriRama shriRama1 = new ShriRama("Shri Rama", "Sita", "Kodanda", "Ayodhya");
        System.out.println(shriRama1);
        System.out.println(shriRama1.hashCode());
        ShriRama shriRama2 = new ShriRama("Shri Rama", "Sita", "Kodanda", "Ayodhya");
        System.out.println(shriRama1.equals(shriRama2));

        Singer singer1 = new Singer("Arijit Singh", 36, "Romantic & Soulful", "Tum Hi Ho");
        System.out.println(singer1);
        System.out.println(singer1.hashCode());
        Singer singer2 = new Singer("Arijit Singh", 36, "Romantic & Soulful", "Tum Hi Ho");
        System.out.println(singer1.equals(singer2));

        Sita sita1 = new Sita("Sita", "Shri Rama", "Janakpur", "Purity and Devotion");
        System.out.println(sita1);
        System.out.println(sita1.hashCode());
        Sita sita2 = new Sita("Sita", "Shri Rama", "Janakpur", "Purity and Devotion");
        System.out.println(sita1.equals(sita2));

        SnowcemPaints snowcemPaints1 = new SnowcemPaints("Pure White", "Matte", 12);
     System.out.println(snowcemPaints1);
     System.out.println(snowcemPaints1.hashCode());
     SnowcemPaints snowcemPaints2 = new SnowcemPaints("Pure White", "Matte", 12);
     System.out.println(snowcemPaints1.equals(snowcemPaints2));

     SonyTV sonyTV1 = new SonyTV(55, true, "4K UHD");
     System.out.println(sonyTV1);
     System.out.println(sonyTV1.hashCode());
     SonyTV sonyTV2 = new SonyTV(55, true, "4K UHD");
     System.out.println(sonyTV1.equals(sonyTV2));

        Spaceship spaceship1 = new Spaceship("SpaceX Starship", 100, true);
        System.out.println(spaceship1);
        System.out.println(spaceship1.hashCode());
        Spaceship spaceship2 = new Spaceship("SpaceX Starship", 100, true);
        System.out.println(spaceship1.equals(spaceship2));

        Star star1 = new Star("Sun", 1.0, "Main Sequence");
        System.out.println(star1);
        System.out.println(star1.hashCode());
        Star star2 = new Star("Sun", 1.0, "Main Sequence");
        System.out.println(star1.equals(star2));

        Stuntman stuntman1 = new Stuntman("Ravi Varma", 45, "Bike stunts and high falls", "KGF Chapter 2");
        System.out.println(stuntman1);
        System.out.println(stuntman1.hashCode());
        Stuntman stuntman2 = new Stuntman("Ravi Varma", 45, "Bike stunts and high falls", "KGF Chapter 2");
        System.out.println(stuntman1.equals(stuntman2));

        TCLTV tcltv1 = new TCLTV(40, false, "Full HD");
     System.out.println(tcltv1);
     System.out.println(tcltv1.hashCode());
     TCLTV tcltv2 = new TCLTV(40, false, "Full HD");
     System.out.println(tcltv1.equals(tcltv2));

     Thriller thriller1 = new Thriller("Dark Chase", "Neil D'Souza", 9);
     System.out.println(thriller1);
     System.out.println(thriller1.hashCode());
     Thriller thriller2 = new Thriller("Dark Chase", "Neil D'Souza", 9);
     System.out.println(thriller1.equals(thriller2));

     Tiger tiger1 = new Tiger("Bengal Tiger", "Sundarbans", true);
     System.out.println(tiger1);
     System.out.println(tiger1.hashCode());
     Tiger tiger2 = new Tiger("Bengal Tiger", "Sundarbans", true);
     System.out.println(tiger1.equals(tiger2));

     Tractor tractor1 = new Tractor("Mahindra", 45, true);
     System.out.println(tractor1);
     System.out.println(tractor1.hashCode());
     Tractor tractor2 = new Tractor("Mahindra", 45, true);
     System.out.println(tractor1.equals(tractor2));

     Train train1 = new Train("Shatabdi Express", 20, true);
     System.out.println(train1);
     System.out.println(train1.hashCode());
     Train train2 = new Train("Shatabdi Express", 20, true);
     System.out.println(train1.equals(train2));

     Truck truck1 = new Truck("Tata", 10, true);
     Truck truck2 = new Truck("Tata", 10, true);
     System.out.println(truck1);
     System.out.println(truck1.hashCode());
     System.out.println(truck1.equals(truck2));

     Villain villain1 = new Villain("Sanjay Dutt", 65, "Intense stare & powerful voice", "Adheera in KGF Chapter 2");
     System.out.println(villain1);
     System.out.println(villain1.hashCode());
     Villain villain2 = new Villain("Sanjay Dutt", 65, "Intense stare & powerful voice", "Adheera in KGF Chapter 2");
     System.out.println(villain1.equals(villain2));

     VizioTV vizioTV1 = new VizioTV(55, true, "4K UHD");
     System.out.println(vizioTV1);
     System.out.println(vizioTV1.hashCode());
     VizioTV vizioTV2 = new VizioTV(55, true, "4K UHD");
     System.out.println(vizioTV1.equals(vizioTV2));


     WingsofFire wingsofFire1 = new WingsofFire("Wings of Fire", "A.P.J. Abdul Kalam", 350);
     String bookRepresentation = wingsofFire1.toString();
     System.out.println(bookRepresentation);
     int intBook=wingsofFire1.hashCode();
     System.out.println(intBook);
     WingsofFire wingsofFire2 = new WingsofFire("Wings of Fire", "A.P.J. Abdul Kalam", 350);
     System.out.println(wingsofFire1.equals(wingsofFire2));

     Yajamana yajamana1=new Yajamana("Darshan",1.75,2.50f);
     Yajamana yajamana2=new Yajamana("Darshan",1.75,2.50f);
     String representationOfYajamaString=yajamana1.toString();
     System.out.println(representationOfYajamaString);
     int intYajama=yajamana1.hashCode();
     System.out.println(intYajama);
     System.out.println(yajamana1.equals(yajamana2));
    }
}
