package com.ankit.conditionsandloops;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side: ");
        int sideOfSquare = sc.nextInt();

        int perimeterOfSquare = 4 *sideOfSquare;

        System.out.println("The perimeter of the square is: "+perimeterOfSquare);
    }
}
