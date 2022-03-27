package day27_practise;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FintaInRange {

    /*
    similar to fizzbuzz

    number
    %3 --> fin
    %5 --> ra
    both --> finra
    neither --> number

    repeated up to some number

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your stopping point:");
        int stop = input.nextInt();

        for (int i = 0; i <= stop; i++) {

            String str = "";

            if (i % 3 == 0){
                str += "FIN";
            }
            if (i % 5 == 0){
                str += "RA";
            }
            System.out.println(str.isEmpty() ? i : str);
//  System.out.println((str.isEmpty() ? i : str) + " ");// will print one line
        }
    }
}
