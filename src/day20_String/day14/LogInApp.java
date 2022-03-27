package day20_String.day14;

import java.util.Scanner;

public class LogInApp {
    /*inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    whent the ssn is not correct print:
        invalid ssn

     */
    public static void main(String[] args) {
        int expectedPin = 1552;
        int expectedSsn = 1234;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert your PIN: ");
        int insertPin = input.nextInt();
        System.out.println("Insert your 4 digits of your SSN");
        int insertSsn = input.nextInt();

        if (expectedPin == insertPin && expectedSsn == insertSsn) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
        if (expectedPin != insertPin) {
            System.out.println("incorrect pin code");
        }
        if (expectedSsn != insertSsn) {
            System.out.println("invalid ssn");
        }
    }
}
