package day08_03_09_2022;

import java.util.Scanner;

public class Po3_UniqueChars {
    public static void main(String[] args) {
            /*
        Task 06: Unique Characters

            Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : bds

            Small Task --> Find me first Unique Char from the String
         */
// manually

        String str = "aabdfccfs";

        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
// dynamic

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            int a=str.indexOf(each);

            int b=str.lastIndexOf(each);

            boolean isUniq=a==b;

            //another approach
            // boolean isUniq = str.indexOf(each) == str.lastIndexOf(each);

            if(isUniq){
                System.out.println(each);
            }


        }

    }

}
