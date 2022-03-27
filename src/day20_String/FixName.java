package day20_String;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        /*
        first name
        last name

        fix to print proper name:
        capital first letter, the rest of the letter lowercase, no exta space
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = input.next(); // jaMES
        System.out.println("Enter your last name");
        String lastname = input.next();

       firstname =  firstname.trim().toLowerCase(); //james
        lastname = lastname.trim().toLowerCase();


        String fixedFirst = firstname.substring(0,1).toUpperCase(); // J
        fixedFirst += firstname.substring(1);  // James


        // firstname.charAt(0) ---> this will also give you the first character, but as a char type


String fixedLast = lastname.substring(0,1).toUpperCase();
fixedLast +=  lastname.substring(1);

        System.out.println(fixedFirst + " " + fixedLast);

    }
}
