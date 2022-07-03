package Lab_5;

import java.util.Scanner;

public class Lab_05_05_NumCompare {
    public static void main(String... args) {

        //Scan = name of scan
        Scanner scan = new Scanner(System.in);
        //Asking user for 2 inputs and then testing them

        //VARIABLE DECLARATION
        //isNumber = name of test
        boolean isNumber = false;
        String notNumber;
        double a = 0;
        double b = 0;

        //Prompt for 1st and 2nd Number


        //Loop for 1st int
        do {
            System.out.println("What is your first number?");
            if (scan.hasNextDouble())
            {
                a = scan.nextDouble();
                isNumber = false;
            }
            else if (scan.hasNextLine())
            {
                notNumber = scan.nextLine();
                isNumber = true;
                System.out.println(notNumber + " is not a number. Please specify a NUMBER...");
            }
        } while (isNumber == true);
        //Loop for second int
        do {
            System.out.println("What is your second number?");
            if (scan.hasNextDouble())
            {
                b = scan.nextDouble();
                isNumber = false;
            } else {
                notNumber = scan.nextLine();
                System.out.println(notNumber + " is not a number?");
                isNumber = true;
            }
        } while (isNumber == true);

        //Test if isNumber(Boolean) = true
        //Compare and Output
        if (isNumber = (a == b))
        {
            System.out.println(a + " and " + b + " are equal!");
        }
        else if (isNumber = (a > b))
        {
            System.out.println(b + " is less than " + a + "!");
        }
        else if (isNumber = (a < b))
        {
            System.out.println(a + " is less than " + b + "!");
        }
        else
        {
            System.out.println("Please try again with a NUMBER!");
        }








    }
}





