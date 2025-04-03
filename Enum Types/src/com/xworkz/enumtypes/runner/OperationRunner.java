package com.xworkz.enumtypes.runner;

import com.xworkz.enumtypes.internal.Operation;

public class OperationRunner {
    public static void main(String[] args) {
        double a = 10, b = 5;
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", a, op, b, op.apply(a, b));
        }
    }
}
