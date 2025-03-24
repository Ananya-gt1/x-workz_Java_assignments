package com.xworkz.india;

public class India {

        private String countryName = "India";
        String capital;
        public int noOfCapital;
        State state;

        public India(String countryName,String capital,int noOfCapital, State state) {
            this.capital = capital;
            this.countryName=countryName;
            this.noOfCapital=noOfCapital;
            this.state = state;
        }

        public void displayIndia() {
            System.out.println("Display the india details:");
            System.out.println("Country: " + countryName);
            System.out.println("Capital: " + capital);
            System.out.println("Number of Capital:"+noOfCapital);
            System.out.println("........................................");

            if (state != null) {
                state.displayState();
            } else {
                System.out.println("No State Information Available.");
            }
        }
    }


