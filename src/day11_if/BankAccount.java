package day11_if;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance");
        double balance = input.nextDouble();
        System.out.println("How much are you withdrawing?");
        double withdraw = input.nextDouble();
   /*
    hard coded version
    double balance = 100;

    double withdraw = 20;
*/
    //withdraw some amount of money from my balance
        balance -=withdraw; // balance = balance - withdraw

        if(balance < 0) {
            System.out.println("Took out too much money, $100 overdraft applied");
            balance -= 100; //balance = balance - 100;
        }
            System.out.println("Balance: $" + balance);

    }
}

