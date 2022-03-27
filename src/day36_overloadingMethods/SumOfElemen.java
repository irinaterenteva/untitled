package day36_overloadingMethods;

public class SumOfElemen {
    public static void main(String[] args) {
        int [] arr = {1,4,23,3};
        System.out.println(sum(arr));
        System.out.println(sum(5,3,6,7,12));
    }

    public static int sum(int ... nums){ //... its arrays

        int sum = 0;
        for (int each:nums    ) {
            sum +=each;
        }
        return sum;
    }
   /*normal version
    public static int sum(int[] nums){

        int sum = 0;
        for (int each:nums    ) {
            sum +=each;
        }
        return sum;
    }

    */
}
