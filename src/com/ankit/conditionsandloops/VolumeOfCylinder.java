package com.ankit.conditionsandloops;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the Cylinder: ");
        double cylinderRadius = sc.nextDouble();

        final double PIE = Math.PI;

        System.out.print("Enter height of the Cylinder: ");
        double cylinderHeight= sc.nextDouble();

        double cylinderVolume = ((PIE)*(cylinderRadius*cylinderRadius)*cylinderHeight);
        System.out.println("The volume of the given cylinder is: "+cylinderVolume);
    }
}
