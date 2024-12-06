package com.ankit.conditionsandloops;

import java.util.Scanner;

public class NthCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num: ");
        int num = sc.nextInt();
        int reqd = sc.nextInt();
        int count = 0;

        for(int i = 0; i <num; i++){
         int digit = num % 10;
            if(digit == reqd){
                count ++;
            }
            num /= 10;
        }
        System.out.println(count);

    }
}
