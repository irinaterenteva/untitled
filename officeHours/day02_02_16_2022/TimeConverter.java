package day02_02_16_2022;

public class TimeConverter {
      /*
       2.Create class named "TimeConverter" and make a main method

                        - Write a Java program to convert time from second to hours/min/day format
                        - Input Seconds : 3695


                            Expected Output:
                            inputSeconds is 3695
                            1 hours 1 minutes 35 seconds
     */

    public static void main(String[] args) {
        int inputSeconds = 3695;
        int hours,minutes,seconds;

        hours = inputSeconds / 3600; //hours = 1
        minutes = inputSeconds % 3600 / 60;
        seconds = inputSeconds % 60;

        System.out.println("Input Seconds is " + inputSeconds + "\n" + hours + " hours " + minutes + " minutes " + seconds + " seconds.");

//extra --> day/hours/min/sec
        int day;
        day = 24 / hours;
        System.out.println(day);

    }
}
