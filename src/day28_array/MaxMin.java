package day28_array;

public class MaxMin {
      /*

        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array
flow: go through each number in the array, compare that number with the biggest number and compare that element with the smallest number
     */
      public static void main(String[] args) {
          int num [] = {500, 120, -80, 90, 250, - 10};
          int  smallerNum = num[0];
          int biggNumber = num[0];

          for (int i = 0; i < num.length; i++) {

              int number = num [i];

            if (number > biggNumber){ // if (num[i] >biggNumber)
               biggNumber = number; //biggNumber = num[i]
                }
            if (number < smallerNum){
                smallerNum = number;
                }

          }
          System.out.println("Biggest number " + biggNumber);
          System.out.println("Smallest number " + smallerNum);
      }
}
