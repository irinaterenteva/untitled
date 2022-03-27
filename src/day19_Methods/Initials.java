package day19_Methods;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        /* ask the user enter their first name
        ask the user to enter their last name
        print initials



         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = input.next().toUpperCase();
        System.out.println("Enter our last name: ");
        String last = input.next().toUpperCase();


        System.out.println("" + first.charAt(0) + last.charAt(0));

        /*
       1)
        char firstlettter = first.charAt(0);

         */
    }
}
