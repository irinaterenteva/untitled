package day10_scanner;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Appartment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)  ->  * 0.9
            - monthly rent after 6 years (discount 20% off original rent) -> * 0.8
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */
        System.out.println("Enter your address ");
        String address = input.nextLine();
        System.out.println("Name of owner ");
        String name = input.nextLine();
        System.out.println("Number of units ");
        int numberUnits = input.nextInt();
        System.out.println("Average size of each unite: ");
        double avSize = input.nextDouble();
        System.out.println("monthly rent amount ");
        double rent = input.nextDouble();
        System.out.println("number of washers and driers ");
        int washer = input.nextInt();
        System.out.println("allows pets or not ");
        boolean allowpets = input.hasNextBoolean();
        System.out.println("has a pool ");
        boolean hasPool = input.hasNextBoolean();
        System.out.println("length of lease ");
        int lenghtLease = input.nextInt();
        System.out.println("total number of residents in building ");
        int numberRes = input.nextInt();
        input.nextLine();
        System.out.println(name +"Enter phone number of owner ");
        String phone = input.nextLine();
        System.out.println("is near a gas station ");
        boolean isGasStation = input.hasNextBoolean();
        System.out.println("number of floors ");
        int floors = input.nextInt();
        System.out.println("has a basement ");
        boolean hasBasement = input.hasNextBoolean();
        System.out.println("has available units for rent");
        boolean available = input.hasNextBoolean();
        System.out.println("has air conditioning ");
        boolean hasAC = input.hasNextBoolean();
        System.out.println("number of parking spaces ");
        int parking = input.nextInt();
        System.out.println("has wheel chair access ");
        boolean hasWheelChair = input.hasNextBoolean();
        System.out.println("number of review stars (out of 5) ");
        byte review = input.nextByte();

      double rentafter3months = rent * 0.9; // 90%
        double rentafter6months = rent * 0.8; //80%
        int averRes = numberRes / numberUnits;
        int averPark = parking / numberUnits;
        int averNperFloor = numberUnits / floors;

        System.out.println("The unit price ");


    }
}
