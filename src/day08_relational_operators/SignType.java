package day08_relational_operators;

public class SignType {

    /*
    Task:

    Declare and assign a number

    I want to know the sign of the number
    is the number positive
    is the number negative
    is the number 0
     */
    public static void main(String[] args) {


        int num = 33;

        boolean isPositive = num > 0;
        boolean isNegat = num < 0;
        boolean isZero = num == 0;

        if (isPositive) {
            System.out.println(num + " is positive");
        }if (isNegat){
            System.out.println(num + " is negative");
        }if (isZero){
            System.out.println(num + " is Zero");
        }

    }
}