package com.ankit.conditionsandloops;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int inputNumber = sc.nextInt();
        System.out.print("The factors of "+ inputNumber + " are: ");
        if (inputNumber == 0){
            System.out.println("0 has infinite factors.");
        } else if(inputNumber==1){
            System.out.println("1 is the only factor of 1.");
        }else{
        for(int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                System.out.print(i + ", ");
            }
        }
        }
    }
}
