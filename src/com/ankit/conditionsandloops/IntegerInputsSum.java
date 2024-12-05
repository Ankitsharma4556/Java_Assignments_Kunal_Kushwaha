package com.ankit.conditionsandloops;

import java.util.Scanner;

public class IntegerInputsSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int inpNum;
        System.out.print("Enter the number: ");
        do {
            inpNum = sc.nextInt();
            sum += inpNum;
        }
        while (inpNum != 0);
        System.out.println("The sum of the inputs is: "+sum);
    }
}
