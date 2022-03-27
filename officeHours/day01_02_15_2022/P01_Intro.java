package day01_02_15_2022;

public class P01_Intro {

    public static void main(String[] args) {

        //Single line comment
        /*
        Multiline Comment

        Primitives
            - Integer --> byte <short int < long   default is int
            - Floating --> float < double          defaulf is double
        Non- Primitives

         */
        int age = 35;
        System.out.println(age);
        System.out.println("age = " + age);

        int a = 5;
        int b = a;
        System.out.println(b);

        int num = -5;
        System.out.println(num++ + ",");
        System.out.println(num = 0);
        System.out.println(","+ --num);

        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9-10+1);
        System.out.println(two);

        long l = 100;
        short s = (short)l;
        System.out.println(s+10);

        short t = 24 + 3 * (10-6) % 2;
        boolean q = s != 25;
        System.out.println(q);
    }
}
