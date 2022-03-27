package day10_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is today");
        String day = input.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: "); //the enter input from he line, you need to hit enter
        String lastName = input.next();
input.nextLine();// the enter input from the line above is absorbed here
        System.out.println("whats your address: ");
        String address = input.nextLine();

        System.out.println("Today is " + day);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("whats your address; " + address);
    }
}
