package day27_practise;

public class ContinueAndNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {

            System.out.println("i " + i);

            for (int j = 0; j < 3; j++) {

                if(j == 1){
                    continue;
                }
                // continue here is skippin the iteration when j is 1, so it does not get printed
                System.out.println("\tj " + j);
            }
        }

    }
}
