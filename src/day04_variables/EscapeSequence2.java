package day04_variables;

import jdk.swing.interop.SwingInterOpUtils;

public class EscapeSequence2 {

    public static void main(String[] arg){

        /*  output exactly:
        "iphone", "laptop, "xbox", "monitor"

         */
        System.out.println("\"iphone\", "+"\"laptop\", " +  "\"xbox\", "+ "\"monitor\"");
        System.out.println("\\");

         }
}
