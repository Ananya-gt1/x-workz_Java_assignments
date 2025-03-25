package com.xworkz.internal;

public class MainRunner {
    public static void main(String[] args) {

        Jail jail = new Jail("Alcatraz", "USA", "John Doe", 100);

        Satellite satellite = new Satellite(SatelliteType.COMMUNICATION, 500000, 1000, 500);

        IdCard idCard = new IdCard("Plastic",new String[]{"Black"}, 5.5, "ABC Corp");

        Alien alien = new Alien("NASA", "2024-01-15", "Tall, Green Skin");

        Camera camera = new Camera("Canon", 1500, CameraType.DSLR, "WiFi");


        Jail[] jails = {
         new Jail("Jail1", "India", "Smith", 50),
         new Jail("Jail2", "UK", "David", 75)
        };

        Satellite[] satellites = {
                new Satellite(SatelliteType.SPY, 700000, 1200, 600)
        };
        IdCard[] idCards = {
                new IdCard("Metal",new String[]{"Black"},10, "XYZ Ltd")
        };
        Alien[] aliens = {
                new Alien("Astronomer", "2023-12-05", "Short, Blue Skin")
        };
        Camera[] cameras = {
                new Camera("Sony", 1200, CameraType.ACTION, "Bluetooth")
        };


        displayJail(jail);
        displaySatellite(satellite);
        displayCameras(cameras);
        displayIdCards(idCards);
        displayAliens(aliens);
    }

    public static void displayJail(Jail jail) {
        System.out.println("Jail Name: " + jail.getName());
        System.out.println("Jail Jailer Name: " + jail.getJailerName());
        System.out.println("Jail Location: " + jail.getLocation());
        System.out.println("Jail Total Cells: " + jail.getTotalCells());
    }

    public static void displaySatellite(Satellite satellite) {
        System.out.println("Satellite Type: " + satellite.getType());
        System.out.println("Satellite Cost: " + satellite.getCost());
        System.out.println("Satellite Weight: " + satellite.getWeight());
        System.out.println("Satellite Load Capacity: " + satellite.getLoadCapacity());
    }

    public static void displayCameras(Camera[] cameras) {
        for (Camera cam : cameras) {
            System.out.println("Camera Brand: " + cam.getBrand());
            System.out.println("Camera Type: " + cam.getType());
            System.out.println("Camera Connectivity: " + cam.getConnectivity());
            System.out.println("Camera Price: " + cam.getPrice());
        }
    }
        public static void displayIdCards(IdCard[] idCards) {
            for (IdCard idCard : idCards) {
                System.out.println("Idcard Material: " + idCard.getMaterial());
                System.out.println("Idcard Designed By: " + idCard.getDesignedBy());
                    System.out.println("Idcard Color: " + idCard.getColors());
                System.out.println("Idcard Weight: " + idCard.getWeight());

            }
        }
            public static void displayAliens (Alien[]aliens){
                for (Alien alien : aliens) {
                    System.out.println("Alien Describe: " + alien.getDescribe());
                    System.out.println("Alien Seen Date: " + alien.getSeenDate());
                    System.out.println("Alien Seen By: " + alien.getSeenBy());

                }
            }
        }




