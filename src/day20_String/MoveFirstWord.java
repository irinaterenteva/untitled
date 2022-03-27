package day20_String;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
         /*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java

        Hint: Use indexOf and substring
     */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().trim();

        int spaceIndex = sentence.indexOf(' '); // (" ") looking for space

        String firstWord = sentence.substring(0,spaceIndex);

        String result = sentence.substring(spaceIndex + 1) + " " + firstWord;

        // String result = sentence.substring(spaceIndex).trim() + " " + firstWord;

        System.out.println(result);




    }
}
