package com.xworkz.mock3.runner;

import com.xworkz.mock3.laptop.Laptop;

import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptops[] = {
                new Laptop("Hp", 65000, 1),
                new Laptop("Dell", 40000, 1),
                new Laptop("Asus", 90000, 2)};
        System.out.println("Enter the Name:");
        String searchLaptop = scanner.nextLine();

        for (Laptop laptop : laptops) {
            if (laptop.getLaptopName().equalsIgnoreCase(searchLaptop)) {
                boolean found = true;
                laptop.display();

            }
        }
    }
}
