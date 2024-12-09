package com.ankit.methods;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of the number is " + factorial(4));

    }

    static int factorial(int n) {
        int prod = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                prod *= i;
            }
            return prod;

        }
    }
}
