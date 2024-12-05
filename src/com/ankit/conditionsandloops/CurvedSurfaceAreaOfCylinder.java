package com.ankit.conditionsandloops;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    //CSA = 2πrh

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = Math.PI;

        System.out.print("Enter the radius of the cylinder base: ");
        double cylinderBaseRadius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double heightOfCylinder = sc.nextDouble();

        double curvedSurfaceArea = (2 * (PI)*(cylinderBaseRadius*heightOfCylinder));

        System.out.println("The curved surface area of the Cylinder is: "+curvedSurfaceArea);
    }
}
