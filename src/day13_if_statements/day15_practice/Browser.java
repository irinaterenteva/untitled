package day13_if_statements.day15_practice;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter browser");
        String browser = input.nextLine();
        String url = input.nextLine();

        switch (browser) {
            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in the chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
            case "safari":
                System.out.println("Opening " + url + "bin safari");
                System.out.println("Loading...");
                break;
            case "Firefox":
            case "firefox":
                System.out.println("Opening " + url + " in Firefox");
                System.out.println("Loading...");
                break;
            default:
                System.out.println(browser + " is not a valid browser");
        }
    }
}
