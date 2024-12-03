package javaPracticeProblems;

public class MethodProblem {
    // Write a method that takes two numbers as parameters and returns their average

    public static double averageCalculator(int a, int b){
     double mySum = a+b;
        double myAverage =(double) mySum/2;
        return  myAverage;
    }

    public static void main(String[] args) {
        averageCalculator(2,5);
    }
}
