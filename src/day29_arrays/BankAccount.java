package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {

    /*

    0 - full name
    1- account time
    2- account number
    3- balance

     */

    public static void main(String[] args) {

        String[] bankAccountOne = {"Brad Smith", "Checking", "1000219482", "100,000,000"};
        System.out.println(bankAccountOne.length);
        System.out.println("Whole array " + Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("account type: " + bankAccountOne[1]);

        System.out.println("Account number: " + bankAccountOne[2]);
        System.out.println("Balance " + bankAccountOne[3]);

        String [] bankAccountTwo = new String[4];
        System.out.println(Arrays.toString(bankAccountTwo));
        bankAccountTwo[0] = "Jamie Fox";
        bankAccountTwo[1] = "Savings";
        bankAccountTwo[2] = "132498329";
        bankAccountTwo[3]= "1025009";

        //bankAccountTwo[20] = ""; out of bounds
        System.out.println(Arrays.toString(bankAccountTwo));

        String [] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        bankAccountThree[0] = fullName;
        System.out.println("Enter our account type");
        bankAccountThree[1] = input.nextLine();
        System.out.println("Enter your account number");
        bankAccountThree[2] = input.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3] = input.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));

        String[] bankAccountFour  = new String[4];
String [] questions = {"full name", "account type", "account number", "balance"};
        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your " + questions);
            bankAccountFour[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(bankAccountFour));
    }
}