package Tasks;

public class Arrays_assesm {
    public static void main(String[] args) {
        String word = " Winter is coming    ";
        word = word.trim();
        System.out.println(word.length());


        String a = "123";
        String b = 5 + 4 + a;
        System.out.println(b);


        String f = "Java is fun";
        char c = f.charAt(4);

        if (c == 'a') {
            System.out.println("A");

        } else if (c == ' ') {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        System.out.println("-----------------------------------");
        String result = 3425 > (9 * 1000) ? "garden" : "patio";
        result.substring(2);
        System.out.println(result);

        System.out.println("-----------------------------------");

        String str = "the fox ran under the bridge";

        str = str.substring(4, 17);
        str.toUpperCase();

        System.out.println(str + "ground");

        System.out.println("-----------------------------------");

        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");
        if (index1 == index2) {
            System.out.println(index1);
        } else {
            System.out.println(index2);

           /* System.out.println("-----------------------------------");
            String z = "popcorn";
            z = z.substring(1, 8);

            if (z.equals("opcor")) {
                System.out.println(z.length());
            } else {
                System.out.println(z.replace("o", "a"));
            } */
            System.out.println("-----------------------------------");

            String v = "today I will go to the beach";
            boolean d = v.contains("i");
            boolean g = v.substring(12).startsWith("go");

            String resultus = d && g ? "go" : "don't go";
            System.out.println(resultus);

            System.out.println("-----------------------------------");

            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }
            System.out.println("-----------------------------------");
            int number = 5;
            while (number < 100) {
                number += number;
            }
            System.out.println(number);

            System.out.println("-----------------------------------");

          /*  String wordus = "java";
            int w = 0;

            do{
                System.out.println(word.charAt(w));
                w++;

            }while (w>wordus.length());
            */
            System.out.println("-----------------------------------");
            String str5 = "The whole time it was raining.";
            do{
                System.out.println(str5.charAt(0));
                str5 = str5.substring(3);
            }while(!str5.isEmpty());
        }
        System.out.println("-----------------------------------");
        String vivo = "cydeo";
        for (int j = 0; j <= vivo.length() ; j+=2) {
            System.out.println(vivo.charAt(j));
int arrays [] = new int[5];
boolean [] bool = {true, false,false, true};

        }
    }
}
