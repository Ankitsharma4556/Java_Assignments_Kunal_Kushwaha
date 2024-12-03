package com.ankit.conditionsandloops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Area = 1/2(b*h)

        System.out.print("Enter base: ");

        int baseOfTriangle = sc.nextInt();
        System.out.print("Enter Height: ");
        int heightOfTriangle = sc.nextInt();

        double areaOfTriangle = (double)(((0.5)*(baseOfTriangle * heightOfTriangle)));

        System.out.println("The area of the triangle with base length: "+baseOfTriangle+" and height: "+heightOfTriangle+" is equal to: "+areaOfTriangle);


    }
}
