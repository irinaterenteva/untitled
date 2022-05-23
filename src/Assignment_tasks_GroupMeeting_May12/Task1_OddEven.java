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
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number :");

        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is Even ");
        } else if (num==0){
            System.out.println("The number " + num + " is Zero");
        }else {
            System.out.println("The number " + num + " is Odd ");


//notes
            /*
            boolean isEven = num % 2 == 0;
            boolean isOdd = num % != 0; // num%2 == 1
             */
        }
    }
}