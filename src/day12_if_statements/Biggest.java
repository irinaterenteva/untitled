package day12_if_statements;

import java.util.Scanner;

public class Biggest {
    /* declare and assign 3 int variables
    btw the 3 numbers find the print the biggest one
     */
    public static void main(String[] args) {
       // int num1 = 3;
        //int num2 = 3;
        //int num3 = 322;
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is Biggest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is Biggest");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is Biggest");
        }
    }
}
