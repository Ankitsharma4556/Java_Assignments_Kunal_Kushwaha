package com.ankit.methods;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks to check grade: ");
        int marks = sc.nextInt();
        yourGrade(marks);
    }
    static void yourGrade(int marks){
        if(marks>100 || marks < 0){
            System.out.println("Enter Valid Marks (0 to 100)");
            return;
        }
       if(marks>= 91){
           System.out.println("AA");
       }else if(marks >=81){
           System.out.print("AB");
       }else if(marks >= 71){
           System.out.println("BB");
       } else if(marks >= 61) {
           System.out.println("BC");
       } else if(marks >= 51) {
           System.out.println("CD");
       } else if(marks >= 41){
           System.out.println("DD");
       }else System.out.println("Fail");
    }
}
