package day20_String.day14;

import java.util.Scanner;

public class AmazonPrime {
    public static void main(String[] args) {
        /*Task:
        declare and assign a price variable
        declare and assign a boolean - hasPrime variable

        posible outputs:
        prime member: Eligible for 2 day shipping

        not prime and item price is more than 25:
        Eligible for regular free shipping

        not prime and item price is less than 25:
        Not eligible for free shipping. Shipping fee: 3.99
         */

        double price = 25.99;
        boolean hasPrime = false;

        if (hasPrime){
            System.out.println("Eligible for 2 day shipping");
        }
        if (price >= 25){
            System.out.println("Eligible for regular free shipping");
        }else{
            //here when hasPrime is false

            System.out.println(" Not eligible for free shipping. Shipping fee: 3.99");
            price +=3.99; //price = price +3.99
        }

    }
}
