package com.ankit.conditionsandloops;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sideOfSquare = sc.nextDouble();

        double totalSurfaceArea = 6 * (sideOfSquare*sideOfSquare);

        System.out.println("Surface Area of the cube is: "+totalSurfaceArea);

    }
}
