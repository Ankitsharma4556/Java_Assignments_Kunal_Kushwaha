package com.ankit.conditionsandloops;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the side: ");
        int sideOfTriangle = sc.nextInt();

        int perimeterOfTriangle = (3 * sideOfTriangle);

        System.out.println("The perimeter of the Equilateral triangle is "+perimeterOfTriangle);
    }
}
