package com.ankit.conditionsandloops;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double PIE = Math.PI;

        double perimeter = (2*PIE*radius);

        System.out.println("The perimeter of the circle is: "+ perimeter);
    }
}
