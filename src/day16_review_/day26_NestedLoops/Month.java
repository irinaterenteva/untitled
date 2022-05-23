package day16_review_.day26_NestedLoops;

public class Month {

    public static void main(String[] args) {

        /*
        go through a whole month, by doing through each week and each day
         */

        for (int week = 1; week <= 4; week++){

            System.out.println("Week: " + week);

            for (int day = 1; day <= 7; day++){
                System.out.println("\tday: " + day);
            }
        }
    }
}
