package day08_relational_operators;

public class OperatorExamples {

    public static void main(String[] args) {
        int b = 10; //b=10 -> 11
        b++; //post increment, no other code, adds 1
        System.out.println(b); // prints the vaue of b, which is 11

        b--; //post decrement, no other code, subtrackt 1
        System.out.println(b); // print the value of b , which is 10
        System.out.println(b++);// post increment, we get the value first which is 10 and we print it
        System.out.println(b++);// post increment , we get the value first, which is 11 and we print it then add 1

        System.out.println(b);


    }
}
