package day19_Methods;

public class MergeStrings {
    public static void main(String[] args) {
        /*

        two Strings: hard code to have 3 characters each merge the Strings together

        ex:
        abc
        xyz

        output: axbycz

         */

        String one = "abc";
        String two = "xyz";

        char a = one.charAt(0);
        char b = two.charAt(0);
        char c = one.charAt(1);
        char y = two.charAt(1);
        char t = one.charAt(2);
        char z = two.charAt(2);

        System.out.println("" + a + b + c + y + t + z);
    }

    /* another approach
    String a = "abc";
    String b = "XYZ";
    String merged = "";
    merged += a.charAt(0); // merged = merged + a.charAt(0)
    merged += b.charAt(0);
    merged += a.charAt(1);
    merged += b.charAt(1);
    merged += a.charAt(2);
    merged += b.charAt(2);

    System.out.println(merged);
     */
}
