package day28_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // with normal avriables

        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburg";


        //declare array with values

        String [] cities = {"Chicago","New York","Houston","Denver","Pittsburg" };
        String [] cities2 = {cityOne, cityTwo, cityThree, cityFour, cityFive};
        System.out.println(cities); // this doesnt print the array how we want

        //how to access each element in the array
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        //print all cities in one line

        System.out.println("Reverse order of the cities" + cities[4] + ", " + cities[3]+ ", " + cities[2]+ ", " + cities[1]+ ", " + cities[0]);

        //ptint the array all at one time
        System.out.println(cities); // this doesnt print the array how we want
        System.out.println(Arrays.toString(cities));// this method from Arrays class lets you print the arra fully

        //number of elements
        System.out.println(cities.length);





    }
}
