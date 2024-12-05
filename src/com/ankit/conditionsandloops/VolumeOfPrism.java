package com.ankit.conditionsandloops;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the Prism: ");
        int base = sc.nextInt();

        System.out.print("Enter the height of the Prism:  ");
        int height = sc.nextInt();

        int volume = base*height;

        System.out.println("The volume of the Prism is: "+volume);
    }
}
