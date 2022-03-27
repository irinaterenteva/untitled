package day37_overloadingContinue;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {


        String year = "2022";

        //normal concatenation
        System.out.println("This year " + year);
        System.out.println("Next year will be " + (year +1));

        int numYear = Integer.parseInt(year); //returns int type
        System.out.println("This year " + numYear);
        System.out.println("Next year will be " + (numYear+1));


        System.out.println("----------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        String str = input.nextLine();
        System.out.println("I am " + str + " years old");
        //in 5 years you will be $ageIn5Years
        int str2 = Integer.parseInt(str);
        System.out.println("In 5 years you will be "+ (str2+5) +" years.");

        System.out.println("----------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String bib = scan.nextLine(); // I am x years old
        //in 5 years you will be $ageIn5Years

        /*
        String [] arr = bib.split(" "):
        String agePart = arr[2];
         */

        String agePart = bib.split(" ")[2];
        int age = Integer.parseInt(agePart);
        System.out.println("In five years, you will be " + (age + 5));

    }
}
/*
I am x years old
I am 10 years old
str.split(" ") --> {"I","am", "10", "years", "old"} --> arr[2] --> 10
 */