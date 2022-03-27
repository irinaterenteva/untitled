package day13_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    /*
    you will have a number

    if the number is divisible by 3 print -> Fizz
    if the number is divisible by 5 print -> Buzz
    if the number is divisible by both 3 and 5 -> FizzBuzz
     id the number is no divisible by any of those, print just the number
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        String message;

        if (number%5==0 && number%3==0  ){
            message = "FizzBuzz";
        }else if(number%3 == 0) {
            message = "Fizz";
        }else if (number%5==0){
            message = "Buzz";
        }else{
            message = " "+number;
        }
        System.out.println(message);
    }
}
