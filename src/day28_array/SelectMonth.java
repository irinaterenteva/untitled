package day28_array;

import java.util.Scanner;

public class SelectMonth {

    /*
    ASk the user the moth number they want, print the month name

    1--> January
    12--> December

    Assume only valid numbers are given, but as a challenge you acn handle invalid numbers

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which month number do you want");
        int mon = input.nextInt(); //4

String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(months[mon - 1]);

        // month [3]
    }
}
