package day10_scanner;

import java.util.Scanner;
import java.util.Scanner;
public class LeapyYear {

/* create a class LeapYear
create a main method
create a Scanner object

Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4, or divisible by 100 but not 400. Print true or false.

Hint: use remainder operator

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the year: ");
int year = input.nextInt();
boolean isLeapYear = year % 4 == 0 || (year %100 == 0 && year % 400 !=0);
        System.out.println("The year " + year + "is leap year,- " + isLeapYear);
    }
}
