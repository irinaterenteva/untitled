package day24_loop;

public class CharactersInString {
     /*
    Characters in String
        Given a String print the ascii value codes for each character
        Ex:
        Input:
        “java” Output:
        106 97 118 97
     */

    public static void main(String[] args) {

        String s = "java";

        for (int i = 0; i < s.length(); i++){

            System.out.println(s.charAt(i) + " ");

// int value = s.charAt(i);

        }
    }
}
