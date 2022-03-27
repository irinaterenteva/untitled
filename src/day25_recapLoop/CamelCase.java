package day25_recapLoop;

import java.util.Scanner;

public class CamelCase {
   /* Camel Case

    Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

    Ex:

    Today is SUNDAY

    Output:

    todayIsSunday */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = scan.nextLine().trim().toLowerCase();
        String camelCase = str.substring(0,1);//putting first character into the String right away bcz my loop will start from i=1. It starts from i = 1 bcz i am doing i -1 to check for spaces and i dont want to do this in the first iteration

        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i - 1)==' '){
                camelCase += str.substring(i, i+1).toUpperCase(); //("" + str.charAt(i)).toUpperCase().sub(i , i+1) is the same as charAt(i)but the types are different
            }else {
                camelCase += str.charAt(i); //today
            }
        }
        System.out.println(camelCase.replace(" ",""));// deleted the spaces

    }
}
