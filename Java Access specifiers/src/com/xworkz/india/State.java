package com.xworkz.india;

public class State {

        public String stateName;
        private int population;
        int cities;
        ChiefMinister cm;

        public State(String stateName, int population,int cities, ChiefMinister cm) {
            this.stateName = stateName;
            this.population = population;
            this.cities=cities;
            this.cm = cm;
        }


        void displayState() {
            System.out.println("Display the state details:");
            System.out.println("State: " + stateName);
            System.out.println("Population: " + population);
            System.out.println("Cities:"+cities);
            System.out.println("....................................");

            if (cm != null) {
                cm.displayCM();
            } else {
                System.out.println("No Chief Minister Assigned.");
            }
        }
    }


