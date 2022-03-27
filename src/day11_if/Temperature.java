package day11_if;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter temperature: ");
        int temperature = input.nextInt();

        if(temperature<70){
            System.out.println("It is a nice day");
            System.out.println("Go outside, but with our laptop to code");
        } else {
            System.out.println("Its too cold");
            System.out.println("Code more java");
        }

    }
}
