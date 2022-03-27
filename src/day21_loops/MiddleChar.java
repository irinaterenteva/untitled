package day21_loops;

public class MiddleChar {

    public static void main(String[] args) {

/*
[Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the String is even there will be two middle characters
b) if the lenght of the string is odd there will be one middle character

Ex.
input: elephant
output: The middle character: ph
 */
        String s = "abcde";
                // 01234
        int len = s.length();

if (s.length() % 2 == 0){
    // our word is even length

    // lenght /2 =>6/2=3

    char firstMiddle = s.charAt(len/2 - 1);
    char secondMiddle = s.charAt(len/2);
    System.out.println("With charAt: " + firstMiddle + secondMiddle);
    System.out.println("With substring: " + s.substring(len/2 - 1, len/2 + 1));
}else {
    // our word is odd length

    char middle = s.charAt(len / 2);
    System.out.println("With charAt:" + middle);
    System.out.println("With substring: " + s.substring(len /2, len/2 +1));



// lenght /2: 5/2 == 2
    // abcdefg
    //    //01234567
    // 7/2 = 3


}





    }
}
