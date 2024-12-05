package com.ankit.conditionsandloops;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the Pyramid: ");
        double heightOfPyramid = sc.nextDouble();
        System.out.print("Enter the base of the Pyramid: ");
        double baseOfPyramid = sc.nextDouble();

        double volumeOfPyramid = (((double)1/3)*(baseOfPyramid*heightOfPyramid));

        System.out.println("The volume of the given Pyramid is: "+volumeOfPyramid);

        sc.close();
    }
}
