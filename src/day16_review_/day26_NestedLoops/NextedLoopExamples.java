package day16_review_.day26_NestedLoops;

public class NextedLoopExamples {
    public static void main(String[] args) {


        for (int i = 0; i <5; i++){
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe\n");



        for (int i = 0; i <5; i++){
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe\n");

        for (int i = 0; i <5; i++){
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe");
        System.out.println("--------------------");



        // outer loop
        for (int j = 0; j < 3; j++) { //int j = 1; j <= 3; --> both give 3 executions/iteration

        // inner loop
            for (int i = 0; i <5; i++){
                System.out.println("Hello World");
            }

            System.out.println("Hello Universe\n");


        }




    }
}
