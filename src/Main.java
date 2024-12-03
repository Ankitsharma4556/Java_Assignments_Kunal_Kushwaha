//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine().toLowerCase();

        char[] charArray = myStr.toCharArray();

        int i = 0;
        int j = charArray.length - 1;

        while (i < j) {
            // Swap characters at i and j
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            // Move the pointers closer
            i++;
            j--;
        }

        String reversedStr = new String(charArray);

        System.out.println((myStr.equals(reversedStr))?"Palindrome":"NotPalindrome");



    }
}