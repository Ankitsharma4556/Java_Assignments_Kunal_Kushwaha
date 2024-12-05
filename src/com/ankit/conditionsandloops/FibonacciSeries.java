package com.ankit.conditionsandloops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prev = 0;
        int curr = 1;

        int upto = sc.nextInt();

        if (upto >= 1) System.out.print(prev + " "); // Print the first term if requested
        if (upto >= 2) System.out.print(curr + " "); // Print the second term if requested



        for(int i = 3; i <= upto; i++){
           int temp = prev+curr;
            System.out.print(temp+" ");
            prev = curr;
            curr = temp;
        }
    }
}
