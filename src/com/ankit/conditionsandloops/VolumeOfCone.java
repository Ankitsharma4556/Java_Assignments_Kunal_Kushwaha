package com.ankit.conditionsandloops;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PIE = Math.PI;

        System.out.print("Enter the height of the Cone: ");
        double heightOfCone = sc.nextDouble();
        System.out.print("Enter the radius of the Cone: ");
        double radiusOfCone = sc.nextDouble();

        double volumeOfCone = (((double) 1 /3)*(PIE)*(radiusOfCone*radiusOfCone)*(heightOfCone));

        System.out.println("The volume of the cone is equal to: "+volumeOfCone);
    }
}
