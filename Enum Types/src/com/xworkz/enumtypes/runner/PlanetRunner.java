package com.xworkz.enumtypes.runner;

import com.xworkz.enumtypes.internal.Planet;

import static com.xworkz.enumtypes.internal.Planet.EARTH;

public class PlanetRunner {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Planet <earth_weight>");
            System.exit(-1);
        }

        try {
            double earthWeight = Double.parseDouble(args[0]);
            double mass = earthWeight / EARTH.surfaceGravity();

            for (Planet p : Planet.values()) {
                System.out.printf("Your weight on %s is %.2f kg%n", p, p.surfaceWeight(mass));
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid input! Please enter a valid number for your weight.");
        }
    }
}
