package com.xworkz.sortArray;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

        public static void main(String[] args) {

            Integer[] numbers = {34, 12, 56, 78, 23, 9, 45, 67, 89, 10};

            Arrays.sort(numbers, Collections.reverseOrder());

            System.out.println("Sorted in Descending Order:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }

