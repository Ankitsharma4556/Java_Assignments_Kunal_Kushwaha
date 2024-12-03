package javaPracticeProblems;

/*
 ****
 ***
 **
 *
 */
public class PatternTest2 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
