package javaPracticeProblems;

import java.sql.SQLOutput;

public class PatternTest {
    public static void printPattern(int n){
        for(int i =1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        printPattern(4);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime);
    }

}
