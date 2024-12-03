package com.ankit.conditionsandloops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the side: ");
        double side = sc.nextDouble();

        double areOfEquilateralTriangle = (Math.sqrt(3)/4)*(side*side);
        System.out.println("The area of the triangle is: "+areOfEquilateralTriangle);
    }
}
