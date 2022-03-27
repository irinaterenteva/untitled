package day02_02_16_2022;

public class PO2_Relational_Unary_Shorthand {
    public static void main(String[] args) {

        //Declaration
        boolean cond = true;
        int a = 10, b = 10;

        System.out.println("======== Data ========");

        System.out.println(cond);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("========= Unary Ops=======");
        System.out.println("cond = " + !!cond); //false


        // POST AND PRE INC
        System.out.println("a = " + a++);
        // memory --> 11             print --> 10
        System.out.println("a = " + a);
        // memory --> 11             print --> 11
        System.out.println("b = " + ++b);
        // memory --> 11             print --> 11
        System.out.println(--a);
        // memory --> 10             print --> 10
        System.out.println(b--);
        // memory --> 10             print --> 11


        System.out.println("========= Relational Ops=======");
        System.out.println(a>--b); //true
        // a= 10 b = 9

        System.out.println(a>=b); //true
        // a= 10 b = 9
        System.out.println(a<b); //false
        System.out.println(a<=++b);//true
        // a= 10 b = 10
        System.out.println(a==b); //true
        System.out.println(a!=--b);//true
        //a=10 b = 9


        boolean c = true;
        boolean d = true;
        c=!d; // c not d , means false
        System.out.println("c = " + c);


        System.out.println("========= Shortand Ops=======");
        //a= 10 b = 9
        a= a+b;
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);

        String name = "Cydeo";
        // Cydeo School

        name+=" School";
        System.out.println(name);
    }
}
