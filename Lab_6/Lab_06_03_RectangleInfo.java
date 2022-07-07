package Lab_6;

import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        //Declare Variables
        double a = 0;
        double b = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean number = true;
        String trash;

        //Loop for Side 1:
        do {
            System.out.println("Length of side 1?");
            if (scan.hasNextDouble()){
                 a = scan.nextDouble();
                 number = true;

            }else if (scan.hasNextLine()){
                trash = scan.nextLine();
                number = false;
                System.out.println(trash + " is not a number. Please re-Try.");
            }

        }while (number == false);

        //Loop for Side 2:
        do{
            System.out.println("Length of side 2?");
            if (scan.hasNextDouble()){
                b = scan.nextDouble();
                number = true;

            }else if (scan.hasNextLine()){
                trash = scan.nextLine();
                number = false;
                System.out.println(trash + " is not a valid number. PLease Re-Try.");
            }

        }while (number == false);

        System.out.println("Side 1: " + a + " units."); System.out.println("Side 2: " + b + " units.");
        System.out.println();

        area = a * b;
        System.out.printf("Area = %.2f " , area); System.out.println("units.");
        //-----------------------------------------
        perimeter = (2*a) + (2*b);
        System.out.printf("Perimeter = %.2f " , perimeter); System.out.println("units.");
        //----------------------------------------------
        diagonal = Math.sqrt((a*a) + (b*b));
        System.out.printf("The length of the diagonal is: %.2f " , diagonal ); System.out.println("units.");



    }
}
