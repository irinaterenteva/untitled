package Assignment_tasks_GroupMeeting_May12;

public class Task5_DivisibleBy3_5_15 {
    /*
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */
    public static void main(String[] args) {
        System.out.println("Divisible by 15: ");
        for (int i=1; i<=100; i++) {
            if (i%3==0 && i%5==0 && i%15==0)
                System.out.print(i +", ");
        }

        System.out.println("\nDivisible by 5: ");
        for (int i=1; i<=00; i++) {
            if (i%5==0 && i%15!= 0)

                System.out.print(i +", ");
        }
        System.out.println("\nDivisible by 3: ");
        for (int i=1; i<=100; i++) {
            if (i%3==0 && i%15!= 0)

                System.out.print(i +", ");
        }

          }


          /*
          public String divisibleBy3515(int a) {
        String num3515 = "";
        String num5 = "";
        String num3 = "";
        for (int i = 0; i < a; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                num3515 += " "+i;
            } else if (i % 3 == 0 && i % 15 != 0) {
                num3 += " "+i;
            } else if (i % 5 == 0 && i % 15 != 0) {
                num5 += " "+i;
            }
        }
        String phrase = "Divisible By 15: " + num3515 + "\nDivisible By 5: " + num5 + "\nDivisible By 3: " + num3;
        return phrase.trim();
           */
}
