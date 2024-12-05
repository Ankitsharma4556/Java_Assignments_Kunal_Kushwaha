package com.ankit.conditionsandloops;
import java.util.Scanner;
public class CapitalizeAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String myString = sc.nextLine();

        String[] newString = myString.split(" ");

        for(int i = 0; i < newString.length; i++){
            if(!newString[i].isEmpty()){
                newString[i]= newString[i].substring(0,1).toUpperCase() + newString[i].substring(1).toLowerCase();
            }
        }
        String finalString = String.join(" ", newString);
        System.out.println(finalString);
    }
}