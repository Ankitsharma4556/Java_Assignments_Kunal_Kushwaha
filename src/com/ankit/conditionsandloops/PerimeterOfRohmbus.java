package com.ankit.conditionsandloops;

import java.util.Scanner;

public class PerimeterOfRohmbus {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the side: ");
            int sideOfRhombus = sc.nextInt();

            int perimeterOfRhombus = 4 * sideOfRhombus;

            System.out.println("The perimeter of the rhombus is: "+perimeterOfRhombus);
        }
    }
