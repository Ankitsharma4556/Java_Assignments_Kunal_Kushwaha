package javaPracticeProblems;

public class PatternTest4 {
    public static void printPattern(int n){

        for(int i = 1; i <=n; i++){
            int num = 0;
            for(int j = 1; j <= i; j++){
                 num++;
                System.out.print(num);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
