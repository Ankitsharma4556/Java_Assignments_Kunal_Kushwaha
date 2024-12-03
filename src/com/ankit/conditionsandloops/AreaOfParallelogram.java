package com.ankit.conditionsandloops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();

        int areaOfParellogram = base*height;
        System.out.println("Area of the parelloogram is "+areaOfParellogram);
    }
}
