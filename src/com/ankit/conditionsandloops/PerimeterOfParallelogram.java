package com.ankit.conditionsandloops;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the side: ");
        int side = sc.nextInt();

        int perimeterOfParellogram = 2 * (base + side);

        System.out.println("The perimeter of the parellelogram is: "+perimeterOfParellogram);
    }
}
