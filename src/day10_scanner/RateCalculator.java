package day10_scanner;

import java.util.Scanner;

public class RateCalculator {

    /* write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();
        System.out.println("How man hours do you work in a week: ");
        int hours = input.nextInt();
        double yearHours = hours * 52;
        double hourlyRate = salary / yearHours;
        System.out.println("your hourly rate is " + hourlyRate);
    }
}
