package day17_string;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java"; //String literal, in String pool

        String second = new String("java");// String object, not in String pool. but directly in the heap

        System.out.println(first==second);

        //  == with String types gives you false, The == doesnt compare the characters, it compares the memory location of the object

        String third = "java";
        System.out.println(first==third);

        String fourth = "Java"; // at this line, how many object in the String pool: 2
        // you have "java" "Java"

        System.out.println(first == fourth);

        String fifth = new String("java");
        System.out.println(second==fifth);

       // at this point how many total objects is there. 3->2 in String pool and 1 separete object directly in the heap
    }
}
