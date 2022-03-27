package day10_scanner;
import java.util.Scanner;

public class EvenOddNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        boolean EvenNumber = number % 2 == 0;
        boolean OddNumber = number % 2 != 0;

        System.out.println("Number "+ number + " is even: " + EvenNumber + "\nis odd: " + OddNumber);

    }
}
