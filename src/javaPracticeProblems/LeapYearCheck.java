package javaPracticeProblems;

public class LeapYearCheck {
    //// Write a program that determines if a year is a leap year
    //// (divisible by 4, but not by 100 unless also divisible by 400)
    public static boolean checkLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(checkLeapYear(2000));

    }
}
