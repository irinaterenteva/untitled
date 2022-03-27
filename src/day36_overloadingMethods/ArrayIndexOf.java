package day36_overloadingMethods;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int[] arr = {12, 5, 1, 4, 23, 5};
        System.out.println(indexOf(arr, 2));
        System.out.println(indexOf(arr, 5));
        System.out.println(indexOf(arr, 12));

        String[] words = {"java", "apple", "hello", "you"};
        System.out.println(indexOf(words, "hello"));
    }

    public static int indexOf(String[] strs, String element) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(element)) {
                return i;
            }
        }


        return -1;

    }

    public static int indexOf(int[] nums, int element) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }


        return -1;

    }
}
