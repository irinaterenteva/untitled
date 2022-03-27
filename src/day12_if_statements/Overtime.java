package day12_if_statements;

public class Overtime {
    /*create a double variable for your hourly rate
create a double variable for the number of hours worked

calculate your net pay, with consideration of overtime pay

    if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
        (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)

     */

    public static void main(String[] args) {
        double hourlyRate = 20.5; // scanner.nextDouble()
        double numberOfHours = 65; // scanner.nextDouble()
        double netPay;
String message;

        if(numberOfHours > 40) {

            // whem the number of hours is more than 40, we will get an extra 1.5 for overtime pay

            double overtimehours = numberOfHours - 40;

            netPay = 40 * hourlyRate;
            netPay += overtimehours * hourlyRate * 1.5; // netPay = netPay + overtimeHours * hourlyRAte *1.5;
            message = "You worked " + numberOfHours + " hours at a rate of " + hourlyRate + " but, " + overtimehours + " of the hours were overtime, so you got an additional pay for those hours. Your net pay was " + netPay;


        } else {
            //when the number of hours is less than 40, we will run this code
            netPay = numberOfHours * hourlyRate;
            message = "You worked " + numberOfHours + " hours at a rate of " + hourlyRate + " there was no overtime. You net pay was: $" + netPay;

        }

        System.out.println(message);
    }
}
