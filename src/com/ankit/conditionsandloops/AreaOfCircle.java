package com.ankit.conditionsandloops;
//Area Of Circle Java Program
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PIE = Math.PI;

        System.out.print("Enter the radius of the Circle: ");
        double radius = sc.nextDouble();

        double areaOfCircle = PIE*(radius*radius);

        System.out.printf("The are of the circle with radius %.2f is %.2f", radius,areaOfCircle);

    }
}
