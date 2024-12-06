package com.ankit.methods;

public class MaxAndMin {
    //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

    public static void main(String[] args) {

        System.out.println(MinNumber(2,4,6));
        System.out.println(MaxNumber(5,7,9));

    }
    static int MinNumber(int a, int b, int c){
        if(a < b && a < c){
            return a;
        }else if(b < a && b < c){
            return b;
        }else {
            return c;
        }
    }

    static int MaxNumber(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if (b > a && b > c) {
            return b;
        }else {
            return c;
        }
    }

}
