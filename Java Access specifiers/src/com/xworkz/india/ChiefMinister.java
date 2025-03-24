package com.xworkz.india;

public class ChiefMinister {

        private String cmName;
        private String party;
        private int termYears;

        public ChiefMinister(String cmName, String party, int termYears) {
            this.cmName = cmName;
            this.party = party;
            this.termYears = termYears;
        }

        // Private method to display CM details
        private void showCMDetails() {
            System.out.println("Chief Minister: " + cmName);
            System.out.println("Party: " + party);
            System.out.println("Term Duration: " + termYears + " years");
        }

        // Public method to access CM details
        public void displayCM() {
            System.out.println("Displaying Chief Minister Details:");
            showCMDetails();
        }
    }

