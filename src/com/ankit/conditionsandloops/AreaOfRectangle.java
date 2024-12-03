package com.ankit.conditionsandloops;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lengthOfRectangle = sc.nextInt();
        int breadthOfRectangle = sc.nextInt();
        int areaOfTriangle = (lengthOfRectangle*breadthOfRectangle);

        System.out.println("The area of triangle with length = : "+lengthOfRectangle+" breadth = : "+breadthOfRectangle + " is equal to "+areaOfTriangle);

    }
}
