package day02_02_16_2022;

public class P01_CastingPractice {


    /*
    byte < short < INT < long < float < DOUBLE

    TYPE CASTING
    1- IMPLICIT CASTING
        double a = 5;
        System.out.println(a); -> 5.0

        - done by complier
        - smaller type to bigger type
        - no loss data
        - called as Widening

    2- EXPLICIT CASTING
        double b = 5.3;
        int i = (int) b;
        System.out.println(a); -> 5

        - done by Developer
        - larger type to smaller type
        - we may loss data
        - called as narrowing
     */
    // byte to short
    public static void main(String[] args) {


        byte b = 10;
        short s = b; //Implicit Casting

        // double to int
        double a = 5.3;
        int i = (int) a;
        System.out.println("i = " + i);;
        a= i;
        System.out.println("a = " + a);


        //long to int
        //long l=99; //Implicit Casting
        long l=9999999999L; // there is no casting
        int i2= (int)l;
        System.out.println("i2 = " + i2);

        double d = 15.2;
        int i3= (int) d;
        System.out.println("i3 = " + i3);
    }
}
