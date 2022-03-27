package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {

    /*
    make an array of your friends names

    asking how many friends do you have

    then ask for each friends name  one at a tiem, store all the names into an array

    at the end print you friend list
     */

    public static void main(String[] args) {


      Scanner input = new Scanner(System.in);
        System.out.println("how many friends do you have");
        int friends = input.nextInt();
        String [] names = new String[friends];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter frien names");
            names[i] = input.next();

        }

        System.out.println(Arrays.toString(names));
    }
}
