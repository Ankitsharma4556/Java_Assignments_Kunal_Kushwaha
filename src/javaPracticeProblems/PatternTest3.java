package javaPracticeProblems;

public class PatternTest3 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printPattern(5);
    }
}
