package day11_if;

public class qweqweq {
    public static void main(String[] args) {
        int score = 60;
        if (score >= 75) {
            System.out.println("Passing");
        }

        if (score<75) {
            System.out.println("Failing");
        }
        int year = 2021;
        boolean lockdown = year == 2020 || year == 2021;

        if(lockdown){
            System.out.println("stay at home");
            System.out.println("practice java");
            System.out.println("wear mask");
        }
        if(!lockdown){// !false->true
            System.out.println("party");
            System.out.println("still practice java");
            System.out.println("maybe travel");
    }

// in the situation where the lockdown
}}
