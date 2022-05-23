package day16_review_.day26_NestedLoops;

import java.util.Scanner;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        /*
        String apple

        count how many times each letter in the String

        a -1
        p -2
        l-1
        e-1

        what we will try to do:

        we will go one character at a time

        charAt(0) --> a

        apple
           a==a
           a==p
           a==p
           a==l
           a==e

           charAt(1) --> p

           apple

           p==a
           p==p
           p==p
           p==l
           p==e
         */

        String s = "apple";

        for (int i = 0; i < s.length(); i++) {

            char letter = s.charAt(i);
            int count = 0; // everytime the outer loop iteractas, the couter is set back to 0. It is reset btw every character
            for (int j = 0; j < s.length(); j++) {

                char eachLetter = s.charAt(j);

                if (letter == eachLetter) { // s.charAt(i) == s.charAt(j)
                    count++;

                }


            }// end of inner loop

            System.out.println(letter + " - " + count);


        }
    }
}
