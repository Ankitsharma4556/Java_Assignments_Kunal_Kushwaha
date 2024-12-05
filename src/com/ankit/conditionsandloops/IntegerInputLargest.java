package com.ankit.conditionsandloops;

import java.util.Scanner;

public class IntegerInputLargest {
    public static void main(String[] args) {
        int largeNum = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");

        int num;
        do {
            num = sc.nextInt();
            if (num!= 0|| num > largeNum) {
                largeNum = num;
            }
        } while (num != 0);
        System.out.println(largeNum);
    }
}
