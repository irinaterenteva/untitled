package day18_String;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
          /*

         Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system password: "jamesbond"

        -> if the entered password matches the system password
            logged in

            otherwise print:

            invalid password

     */
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your username: ");
        String username = input.next();
        username = username.toLowerCase(); // reasign username to new object username.toLowerCase();
        System.out.println(username);
        System.out.println("Please, enter your password: ");
        String password = input.next();
        System.out.println(password);

        if(password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("logged in with " + username);
        }else{
            System.out.println("invalid password");
        }

    }
}
