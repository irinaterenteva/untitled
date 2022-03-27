package day11_if;

public class CheckHunger {

    /* Task
    boolean variable isHungry
    id person is hungry : print : You are hungry so i will get food for you

    if the person not hungry, print : Great, then practice java
     */
    public static void main(String[] args) {
        boolean isHungry = true;
        if(isHungry){
            System.out.println("You are hungry, so I will get some food for you");
        } else {
            System.out.println("Great, then practice java");
        }
    }
}
