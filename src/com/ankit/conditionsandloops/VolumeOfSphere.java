package com.ankit.conditionsandloops;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = Math.PI;
        System.out.print("Enter the radius of the Sphere: ");
        double radiusOfSphere = sc.nextDouble();

        double volumeOfSphere = (((double)4/3)*PI*(radiusOfSphere*radiusOfSphere*radiusOfSphere));
        System.out.println("The volume of the Sphere is: "+volumeOfSphere);
    }
}
