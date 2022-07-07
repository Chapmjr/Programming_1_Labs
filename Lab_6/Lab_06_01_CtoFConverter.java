package Lab_6;

import java.util.Scanner;

public class Lab_06_01_CtoFConverter
{
    public static void main(String... args) {
        //Scan = name of scan
        Scanner in = new Scanner(System.in);

        //Declare Variables
        double C = 0;
        double F;
        boolean isNumber = false;
        String trash;

        do {
            System.out.println("What is your Celcius Temperature?");
            //Code if next line is a number
            if (in.hasNextDouble()) {
                C = in.nextDouble();
                isNumber = true;
                System.out.println("You entered " + C + " as your Celcius Temperature.");
                F = (C * (9/5) + 32);
                System.out.println("Your fahrenheit temperature is " + F + " degrees.");

                //Code if next Line is a string
            } else if (in.hasNextLine()){
                trash = in.nextLine();
                System.out.println("'" + trash + "'" + " is not a number. Please retype temperature.");


            }
        } while (isNumber = false);

        System.out.println("Please restart....");




    }
}
