package day08_relational_operators;

public class AllOperators {

    public static void main(String[] args) {

        System.out.println(5+2*3);

        //                 5+6
        //                 11

        System.out.println(5 *2 + 4/ 2);
        //                  10 + 2
        //                  12

        int a = 20;
        int b = -a-- + a++ + --a * a--;
// -20 + 19 + 19* 19
       // -1 + 361
        // 360
        System.out.println(a);//18
        System.out.println(b);//360
    }
}
