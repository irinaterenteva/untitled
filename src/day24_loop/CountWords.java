package day24_loop;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words Output:
    4
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();
        int spaces = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i)== ' '){ // str.substringing(i , i +1)
                spaces++;
            }
        }
        System.out.println("Number of words: " + (spaces +1));

    }
}
