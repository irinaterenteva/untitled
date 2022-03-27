package day13_if_statements.day15_practice;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        /* Task:
        Ask the user to enter which day is it
        print which class we have on that day, and the time of the class
        show if there is office hours
         */
        Scanner input = new Scanner(System.in);
        System.out.println("what day do you want to know about? ");
        String day = input.next();
        String information = "";

        switch (day) {
            case "Monday":
            case "monday":
            case"mon":
                information = "We have Java with Saim at 6 pm EST";
                break;
            case "Tuesday": case "tuesday":  case "tue":
            case "Wednesday": case "wednesday": case "wed":
                information = "We have Java with Saim at 6 pm EST, but we also have office hours with Mehmet at 4:30 PM";
                break;
            case "Thursday": case "thursday": case "thur":
                information = "We have Soft Skills with Nadir at 6 pm EST";
                break;
            case "Friday": case "friday": case "fri":
                information = "Day OFF";
                break;
            case "Saturday": case "saturday" : case "sat":
            case "Sunday": case "sunday": case "sun":
                information = "We have Java with Saim at 9 am - 4 pm EST";
                break;
            default:
                information = "Not valid day";
        }
        System.out.println(information);
    }
}
