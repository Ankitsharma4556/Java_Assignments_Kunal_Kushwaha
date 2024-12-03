package com.ankit.conditionsandloops;

import java.util.Scanner;

public class AreaOfRohmbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonal1: ");
        int diagonal1 = sc.nextInt();
        System.out.print("Enter diagonal2: ");
        int diagonal2 = sc.nextInt();

        double areaOfRohmbus = (double)(diagonal1*diagonal2)/2;
        System.out.println("Area of the rohmbus is: "+areaOfRohmbus);
    }
}
