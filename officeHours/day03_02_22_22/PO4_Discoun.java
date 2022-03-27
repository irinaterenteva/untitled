package day03_02_22_22;

public class PO4_Discoun {
    public static void main(String[] args) {
             /*
                    Task :         A book store will give discount of 10% if the cost of purchased quantity is more than 1000.
                            Create a quantity variable
                                Suppose, one unit will cost 100.
                                Judge and print total cost for user.
                                ( Scanner Class can be used )

                            INPUT for quantity :  5                                      EXPECTED : No discount applied

                            INPUT for quantity  :  15                                    EXPECTED : You get a discount of $totalDiscount and your total cost is $totalCost                                                                                            your total cost is $totalCost

         */
        int quantity = 15;
        int unitPrice = 100;
        double totalCost = quantity * unitPrice;
        double discountRate = 0.15;
        double totalDiscount = 0;

        if (totalCost >= 1000) {
            //i will apply discount
            totalDiscount = discountRate * totalCost;
            System.out.println("You get a discount of " + totalDiscount + " and you total cost is " + (totalCost - totalDiscount));

        } else {

            //will not apply any discount
            System.out.println("No discout applies");
        }

    }
}