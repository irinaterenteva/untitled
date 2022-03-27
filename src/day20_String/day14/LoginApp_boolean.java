package day20_String.day14;

import java.util.Scanner;

public class LoginApp_boolean {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode: ");
        int actualPin = input.nextInt();
        System.out.println("Please enter the last 4 digits of your ssn");
        int actualSSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;
        boolean validPin = actualPin == expectedPin;
        boolean validSSN = actualSSN == expectedSSN;

        if( validPin && validSSN ){
            System.out.println("Authentication successful");
        } else {

            System.out.println("Authentication failed");

            if(!validPin){
                System.out.println("incorrect pin code");
            }

            if(!validSSN){
                System.out.println("incorrect ssn");
            }

        }

        // valid pin: true -> !true -> false
        // ssn wrong: false -> !false -> true


    }

}



