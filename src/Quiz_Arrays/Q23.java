package Quiz_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Q23 {
    public static void main(String[] args) {
        ArrayList<String>words = new ArrayList<>(Arrays.asList("during","storm", "rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> lenghts = new ArrayList<>();

        for(String word: words){
            lenghts.add(word.length());
        }
        System.out.println(lenghts);
    }
}
