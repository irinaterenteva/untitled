package day19_Methods;

import java.util.Scanner;

public class Title {

    public static void main(String[] args) {

         /*
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name, with titles");
        String name = input.nextLine().toLowerCase();

        if (name.startsWith("mr ") || name.startsWith("mister ")) {
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms ") || name.startsWith("miss ") || name.startsWith("madam ")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr ")) {
            System.out.println("Hello Doctor");
        }

        if (name.endsWith(" sr")) {
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith(" jr")) {
            System.out.println("Nice to meet you Junior");
        }
    }
}
