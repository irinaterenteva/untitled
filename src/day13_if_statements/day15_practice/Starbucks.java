package day13_if_statements.day15_practice;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
         /*

    Declare price and calories variables

    Ask the user to enter which size drink they want

    Based on the drink size determine the price and calories of the order

        data:

            size: tall
            price: 2.50
            calories: 100

            size: grande
            price: 4.00
            calories: 150

            size: venti
            price: 4.50
            calories: 200

     */
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to Starbucks, Gabi. Enter size coffee would you like to orde ");
        String size = input.nextLine();

        double price = 0;
        int calories = 0;
        boolean validOrder = true;// by makig it true, i pick that all are valid, when  i have an invalid order i willl change the value
        switch (size){
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                size = "invalid size";
                validOrder = false;
        }
        System.out.println("Cofee size is: " + size + "\nprice: $" + price + "\ncalories: " + calories);
    }
}
