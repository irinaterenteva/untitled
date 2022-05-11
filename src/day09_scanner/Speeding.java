package day09_scanner;

import java.util.Scanner;

public class Speeding {

    /* create a class called SPeeding, write a program to determine if the car is speeding

    declare 3 variables
    current speed, spped limit, speeding boolean

    print
    "Are you speeeding?" true/false
     */

    public static void main(String[] args) {


        int curSpeed;
        int speedLimit;


        System.out.println("Please, enter your speed");
        Scanner input = new Scanner(System.in);
        curSpeed = input.nextInt();
        System.out.println("Please,ebter speed limit:");
        speedLimit = input.nextInt();

        if (speedLimit>=curSpeed){
            boolean areYouSpeeding = curSpeed >= speedLimit;
            System.out.println("Are you speeding? " + areYouSpeeding);
        }else{
            System.out.println("Are you speeding? : false" );
        }
    }

}
