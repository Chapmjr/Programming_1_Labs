package Lab_6;

import java.util.Scanner;

public class Lab_06_04_MetricConverter {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        //------Declare Variables------
        double meterValue = 0;
        //----CONVERSIONS----
        double miles = 0;
        double feet = 0;
        double inches = 0;
        //-----Testing Variable----
        boolean validNumber = false;
        //----String Variable----
        String trash;

        do{
           System.out.println("What is your measurement in meters?");
           if (scan.hasNextDouble()){
               meterValue = scan.nextDouble();
               validNumber = true;
           }else if (scan.hasNextLine()){
               trash = scan.nextLine();
               validNumber = false;
               System.out.println(trash + " is not a valid input. Try Again.");
           }
        }while (validNumber == false);

        //---Conversion Formulas: ----
        //MILES
        miles = 0.000621371 * (meterValue);
        feet = 3.28084 * (meterValue);
        inches = 39.37 * (meterValue);
        //OUTPUTS FOR MILES< FEET< AND INCHES
        System.out.printf(meterValue + " meters >>>> miles is: %.5f " , miles); System.out.println(" miles.");
        System.out.println();
        System.out.printf(meterValue + " meters >>>> feet is: %.3f " , feet); System.out.println(" feet.");
        System.out.println();
        System.out.printf(meterValue + " meters >>>> inches is: %.3f " , inches); System.out.println(" inches.");


    }
}
