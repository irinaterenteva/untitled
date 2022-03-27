package day18_String;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty());


        str = "";
        System.out.println(str.isEmpty());//true

        String s = " "; // space as a character
        System.out.println("s is Empty: " + s.isEmpty()); // false because a space is there , space is a character

      /*
        if(s.length() < 0 ){
            System.out.println("empty"); // check for real character not empty spaces
        }

       */

        System.out.println("s is blank: " + s.isBlank());
    }
}
