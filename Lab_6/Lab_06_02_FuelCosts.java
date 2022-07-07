package Lab_6;

import java.util.Scanner;

public class Lab_06_02_FuelCosts {
    public static void main(String... args) {

        //Scan = name of scan
        Scanner in = new Scanner(System.in);

        //Declare Variables (User inputs these)

        double numGal = 0;
        double fuelEfficiency = 0;
        double priceGal = 0;
        double costPer100Miles = 0;
        double estTravelDistance = 0;
        String trash;
        //no number
        boolean noNumber = false;

        do {
            System.out.println("Please enter the number of gallons in the tank.");
            if (in.hasNextDouble())
            {
                numGal = in.nextDouble();
                noNumber = false;
            } else if(in.hasNextLine())
            {
                trash = in.nextLine();
                noNumber = true;
                System.out.println("'" + trash + "'" + "is not a number. Please restart.");
            }

        } while (noNumber == true);
        do {
                System.out.println("Please enter the fuel efficiency in Miles Per Gallon (MPG)");
                if (in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                noNumber = false;
            } else if (in.hasNextLine())
            {
                trash = in.nextLine();
                noNumber = true;
                System.out.println(trash + " is not a number. Please enter a number.");
            }
        }while (noNumber == true);
        do {
            System.out.println("Please enter the price per gallon of gas.");
            if (in.hasNextDouble()){
                priceGal = in.nextDouble();
                noNumber = false;
            } else if (in.hasNextLine()){
                trash = in.nextLine();
                noNumber = true;
                System.out.println(trash + " is not a valid price.");
            }
        }while (noNumber == true);

        costPer100Miles = (100/fuelEfficiency) * priceGal;
        System.out.printf ("The cost per 100 miles is: %.2f " , costPer100Miles); System.out.println(" dollars.");

        System.out.println();

        estTravelDistance = numGal * fuelEfficiency;
        System.out.printf("You can travel approximately: %.2f " , estTravelDistance); System.out.println(" miles!");



    }
}
