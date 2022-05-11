package day08_relational_operators;

public class GiftCard {

    /* declare and assign a gift card with 200
    buy 2 items.
    buy item 1 for x price and subtract from your gift card
    buy item 2 for x price and subtract from your gift card
    print the remaining balance of your gift card
     */

    public static void main(String[] args) {

        double GiftCard = 200;
        System.out.println("Buy item 1 for $100");
        double itemOne = 100;
        System.out.println("Buy item 2 for $30");
        double itemTwo = 30;

         GiftCard -= itemOne;
         GiftCard -= itemTwo;

        System.out.println("GiftCard remaining balance = " + GiftCard);


    }
}
