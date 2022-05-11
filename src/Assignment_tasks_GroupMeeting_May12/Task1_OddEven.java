package Assignment_tasks_GroupMeeting_May12;

import java.util.Scanner;

public class Task1_OddEven {
    public static void main(String[] args) {
        /*
         Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
         */

        int num;

        System.out.print("Enter the number :");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is Even ");
        } else {
            System.out.println("The number " + num + " is Odd ");

        }
    }
}