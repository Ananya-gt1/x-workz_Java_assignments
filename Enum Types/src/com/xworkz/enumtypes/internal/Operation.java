package com.xworkz.enumtypes.internal;

public enum Operation {
    ADDITION("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACTION("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICATION("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVISION("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double x, double y);

    public String toString() {
        return symbol;
    }
}
