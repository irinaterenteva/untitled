package day17_string;

public class String_methods {
    public static void main(String[] args) {
        String name = "james";

        // how to compare String values-->use .equals()
        System.out.println(name.equals("james"));

        System.out.println("cat".equals("dog"));

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b)); //compares a object with b object (just comparing the value

        System.out.println(a.equals("hello")); //compares a object with literal "hello"object

        System.out.println(name.length());

        String last = "Today was fun";
        System.out.println(last.length());

        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));

    }
}
