package day16_review_;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
    declare and assign 2 number variables
    declare and assign a char variable for an operator

    create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num2
        / : divide num1 and num2
        any other char: "invalid operator"
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        double numOne = input.nextDouble();
        System.out.println("Pick operators: + - * / %");
        String operator = input.next();
        System.out.println("Enter number two: ");
        double numTwo = input.nextDouble();

        double result = 0;
        boolean validCal = true;
        switch (operator) {
            case "+":
            case "plus":
                result = numOne + numTwo;
                break;
            case "-":
            case "minus":
                result = numOne - numTwo;
                break;

            case "*":
            case "x":
                result = numOne * numTwo;
                break;
            case "/":

                if (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("Can not divide by 0");
                }

                break;
            case "%":
                if (numTwo != 0) {
                    result = numOne % numTwo;
                } else {
                    System.out.println("Can not divide by 0");
                    validCal = false;
                }
                break;

            default:
                System.out.println(operator + " is not valid operator for this calculator");
                validCal = false;

        }
        if (validCal) {
            System.out.println(numOne + " " + operator + " " + numTwo + " = " + result);
            validCal = false;
        }
    }
}