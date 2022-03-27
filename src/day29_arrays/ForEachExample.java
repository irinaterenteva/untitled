package day29_arrays;

public class ForEachExample {

    public static void main(String[] args) {

        int [ ] num = {30, 12, 159, 12};

        for (int i = 0; i < num.length; i++){
            System.out.println("traditional " + num[i]);
        }
        System.out.println();

        for (int element : num) {
            System.out.println("for each : " + element);

                   }

        //String example


        String [] classes = {"java", "soft skills", "selenium", "database", "api"};

        //traditional

        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);


        }
        System.out.println();

        //for each
        for (String word : classes){
            System.out.println(word);
        }

        //double example

        double [] prices = {10.4, 40.2, 410.2};

        //for each

        for(double each : prices){
            System.out.println("$" + each);
        }
    }
}
