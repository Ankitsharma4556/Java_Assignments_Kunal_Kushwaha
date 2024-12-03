package com.ankit;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        int revNum = 0;

        while(num > 0){
           int digit = num % 10;
           revNum = revNum * 10 + digit;

           num /= 10;
        }
        System.out.println(revNum);
    }
}
