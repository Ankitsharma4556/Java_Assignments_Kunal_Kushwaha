package com.ankit.methods;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(oddEven(99));

    }
    static String oddEven(int n){
        return (n%2==0)?"Even":"Odd";
    }
}
