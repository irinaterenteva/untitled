package day40_arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());

        ArrayList<String> days = getDaysOfWeek();
        System.out.println(days.get(0));

        System.out.println(getDaysOfWeek().get(0));

    }

    public static ArrayList<String> getDaysOfWeek(){
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));
        return days;
    }

    /*

        String a = "abc"
        a.toUpperCase().replace("a", "d").trim();
        a = a.toUpperCase()
        .replace("a", "d")
        .trim()

     */

}
