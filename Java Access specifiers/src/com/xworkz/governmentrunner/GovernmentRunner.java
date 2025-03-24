package com.xworkz.governmentrunner;

import com.xworkz.government.Department;
import com.xworkz.government.Government;
import com.xworkz.government.Officer;

public class GovernmentRunner {

        public static void main(String[] args) {

            Officer officer = new Officer("Ananya", "District Collector", 80000.50);

            Department department = new Department("Revenue Department", 500,"Active", officer);

            Government government = new Government("Democratic", "India","Indian govt",department);

            government.displayGovernment();
        }
    }

