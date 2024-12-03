package javaPracticeProblems;

public class SumEvenNumbers {

    // Write a method that takes a number n and returns the sum of all even numbers from 1 to n
    public static int evenSum(int n){
        int sum = 0;
        for(int i =1; i <=n; i++){
            if(i % 2==0){
                sum += i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenSum(4));
    }
}
