package day13_if_statements;

public class Diver {
    /*create a class Diver

You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
    Above 70 - Don't go too far
    Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%


     */
    public static void main(String[] args) {
        int a = 62; //oxygen level
        if (a > 90) {
            System.out.println("Your tank is full");
        } else if (a > 80) { //else if(a>80 && a<90) not needed
            System.out.println("still okay");
        } else if (a > 70) {
            System.out.println("don't go too far");
        }else if (a>60){
            System.out.println("start to head back");
    }else if (a>50){
            System.out.println("Be careful now you are at 50%");
            } else {
            System.out.println("Dangerous");
        }
        System.out.println("------------------------------");
        String message;
        int b = 24; //oxygen level
        if (b > 90) {
            message = "Your tank is full";
        } else if (b > 80) { //else if(a>80 && a<90) not needed
            message = "still okay";
        } else if (b > 70) {
            message = "don't go too far";
        }else if (b>60){
            message="start to head back";
        }else if (b>50){
            message="Be careful now you are at 50%";
        } else {
            message="Dangerous";
        }
        System.out.println(message);
        }
    }
