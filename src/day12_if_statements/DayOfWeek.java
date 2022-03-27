package day12_if_statements;

import java.util.Scanner;

public class DayOfWeek {
    /* Declare and assign a number (day)

    1- monday
    2- tuesday
    ..
    7 - sunday

     */
    public static void main(String[] args) {

        int num = 4;

        if (num == 1){
            System.out.println("Monday");
        } else if (num == 2){
            System.out.println("Tuesday");
        } else if (num == 3){
            System.out.println("Wednesday");
        }else if (num == 4){
            System.out.println("Thursday");
        }else if (num == 5){
            System.out.println("Friday");
        }else if (num==6){
            System.out.println("Saturday");
        }else if (num==7){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid number");
        }

    }
}
