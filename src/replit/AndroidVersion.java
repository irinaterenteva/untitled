package replit;

import java.util.Scanner;

public class AndroidVersion {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String version = input.nextLine();

        //WRITE YOUR CODE BELOW:
        String number="";
        switch(version){
            case "1.5":
                number = "Cupcake";
                break;
            case "1.6":
                number = "Donut";
                break;
            case "2.1":
                number = "Eclair";
                break;
            case "2.2":
                number = "Froyo";
                break;
            case "2.3":
                number = "Gingerbread";
                break;
            case "3.1":
                number = "Honeycomb";
                break;
            case "4.0":
                number = "Ice Cream Sandwich";
                break;
            case "4.1":
                number = "Jelly Bean";
                break;
            case "4.4":
                number = "KitKat";
                break;
            case "5.0":
                number = "Lollipop";
                break;
            case "8.0":
                number = "Oreo";
                break;
            case "9.0":
                number = "Pie";
                break;
            default:
                number = "Not a valid version";
        }
        System.out.println(number);


    }
}
