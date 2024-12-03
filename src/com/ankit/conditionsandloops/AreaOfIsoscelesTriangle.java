package com.ankit.conditionsandloops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();

        double areaOfIsosecelesTriangle = ((0.5)*(base*height));

        System.out.println("The area of the triangle is: "+areaOfIsosecelesTriangle);
    }
}
