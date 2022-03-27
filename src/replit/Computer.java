package replit;

import java.util.Scanner;

public class Computer {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Select screen size:");
            String screenSize = input.next();
            double totalPrice = 0.00;

            switch(screenSize){
                case "13.3":
                    totalPrice +=200;
                    break;
                case "15.0":
                    totalPrice +=300;
                    break;
                case "17.3":
                    totalPrice +=400;
                    break;
            }
            System.out.println("Select CPU type:");
            String CPU = input.next();

            switch(CPU){
                case "i3":
                    totalPrice +=150;
                    break;
                case "i5":
                    totalPrice +=250;
                    break;
                case "i7":
                    totalPrice +=350;
                    break;
            }
            System.out.println("Select RAM size:");
            int RAM = input.nextInt();
            boolean isDiv = RAM % 4 == 0;
            if(isDiv==true){
                totalPrice += 50;
            }

            System.out.println("Select storage type:");
            String storage = input.next();
            System.out.println("Select storage size:");
            int size = input.nextInt();

            if(storage=="HDD"&& size==500){
                totalPrice += 50;}
            else if(storage == "SSD"&& size ==500){
                totalPrice +=100;

            }
            System.out.println("Select screen resolution:");
            String resolution = input.next();
            if(resolution=="FULLHD"){
                totalPrice +=100;
            }else if (resolution=="4K"){
                totalPrice += 200;
            }

            System.out.println("Final price is: $" + totalPrice);
        }
    }


