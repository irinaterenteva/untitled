package day04_02_23_2022;

public class P03_Ternary {
    public static void main(String[] args) {

/*
?--- if
:--- else



 */
        int a = 5;
        int b = 10;

        System.out.println(a > b ? a : b);


        System.out.println("========= SQUARE TASK WITH TERNARY========");
        int x = 5;
        int y = 4;
        if (x == y) {
            // it is square
            System.out.println("Square");
        } else {
            //it is rectangle
            System.out.println("Rectangle");
        }
        String result = x==y?"Square":"Rectangle";
        System.out.println("result = " + result);



    }
}
