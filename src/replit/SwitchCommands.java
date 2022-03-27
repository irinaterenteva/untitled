package replit;

import java.util.Scanner;

public class SwitchCommands {

        public static void main(String[] args) {
            //DO NOT TOUCH BELOW
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter command:");
            char response = scan.next().charAt(0);
            //WRITE YOUR CODE BELOW
            String message = "";
            switch(response){
                case 'y':
                    message = "Your request is being processed";
                    break;
                case 'n':
                    message = "Thank you for your consideration";
                    break;
                case 'h':
                    message = "Sorry, no live agents are currently available";
                    break;
                default:
                    message="Invalid entry, please try again";

            }
            System.out.println(message);
        }
    }

