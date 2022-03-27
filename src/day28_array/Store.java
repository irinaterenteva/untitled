package day28_array;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {


        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods"};
        // Do we have jackets in stock?
        System.out.println("Do we have jackets in stock?");

        boolean hasJacket = false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jackets")) {
                hasJacket = true;
                break;
            }
        }
        System.out.println(hasJacket ? "Jackets in stock" : "Jackets out of stock");

        System.out.println(Arrays.toString(items).toLowerCase().contains("jackets"));

        /*
        if(hasJacket) {
        sout("jackets in stock");
        }else{
        sout("jackets out of stock");

         */

            //use Scanner to ask which item they are looking for, and check if we have it
            Scanner input = new Scanner(System.in);
            System.out.println("What item are you looking for?");
            String item = input.nextLine();
            boolean inStock = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase(item)){
                inStock = true;
                break;
            }

            }
            System.out.println(item + (inStock ? " in stock " : " out of stock "));
        }


        }

