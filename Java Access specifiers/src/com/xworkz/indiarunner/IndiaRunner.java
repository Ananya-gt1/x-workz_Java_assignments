package com.xworkz.indiarunner;

import com.xworkz.india.ChiefMinister;
import com.xworkz.india.India;
import com.xworkz.india.State;

public class IndiaRunner {

        public static void main(String[] args) {
            // Creating Chief Minister object
            ChiefMinister cm = new ChiefMinister("Basavaraj Bommai", "BJP", 5);

            // Creating State object with a CM
            State state = new State("Karnataka", 67000000, 40,cm);

            // Creating India object with a State
            India india = new India("India","New delhi",37, state);

            // Displaying India details
            india.displayIndia();
        }
    }

