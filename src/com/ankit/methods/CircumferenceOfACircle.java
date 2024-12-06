package com.ankit.methods;

public class CircumferenceOfACircle {
    static final double PI = Math.PI;
    public static void main(String[] args) {
        System.out.println("The circumference of the circle is: "+circumferenceOfACircle(87.2));


    }
    static double circumferenceOfACircle(double radius){
        return (2 * PI )* (radius);
    }
}
