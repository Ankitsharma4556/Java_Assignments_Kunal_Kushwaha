package com.ankit.conditionsandloops;

import java.util.Scanner;

public class SubtractProductAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num: ");
        int num = sc.nextInt();
        int digit = 0;
        int sumOfDigit = 0;
        int prodOfDigit = 1;
        while(num > 0){
            digit = num % 10;
            sumOfDigit += digit;
            prodOfDigit *= digit;
            num /= 10;
        }
        System.out.println(prodOfDigit - sumOfDigit);
    }
}
