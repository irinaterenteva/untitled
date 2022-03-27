package day25_recapLoop;

import java.util.Scanner;

public class PrimeNumber {
  /*
    [IQ] Prime number [Loops]

    Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            11

        Output:
            prime

    Ex:
        Input:
            10

        Output:
            not prime
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new number: ");
        int number = input.nextInt();
boolean isPrime = number >= 2; //true when you valid numbers -> more than 1, otherwise it will be false

/*

n%2
n%3
n%4
...
n % less than number

11
11% 2
11%3
11%4
11%10


10 % 2 --> change the boolean to false cuz 10 was not prime

 */
        //this loop is trying to check if our number is evenly divisible by value from 2 to the number

                for (int i = 2; 1 < number; i++){
                    if (number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
if (isPrime){
    System.out.println(number + " is prime");
}else{
    System.out.println(number + " is not prime");
}
    }

}
