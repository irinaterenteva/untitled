package replit;

public class Interview {
    public static void main(String[] args) {
        /* username longer than 3 characters

        start with 3 a

         */

        String name = "aaphssaa";

        if (name.length()>3 && name.startsWith("aaa")){
            System.out.println("passed");

        }else{
            System.out.println("failed");
        }

    }
}
