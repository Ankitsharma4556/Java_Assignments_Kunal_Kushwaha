package com.ankit.methods;

public class VotingEligibilty {
    public static void main(String[] args) {
        System.out.println(isEligible(18));

    }
    static boolean isEligible(int age){
        return age >= 18;
    }
}
