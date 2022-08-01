package Lab_7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_7_GettingLoopy {
    public static void main(String[] args) {
        //---QUESTION 1----
        //Count up from 0 to 30
        for (int cnt = 0; cnt <= 30; cnt++) {
            System.out.println(cnt);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        //------Question 2------
        //------COUNT DOWN from 30 to 0--------
        for (int cnt = 30; cnt >= 0; cnt--) {
            System.out.println(cnt);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        //Question 3
        //COUNTS UP from 0 to 18 by 3
        for (int cnt = 0; cnt <= 18; cnt = cnt + 3) {
            System.out.println(cnt);
        }
        System.out.println("----------------------------------------------------------------------------------------");
        //Question 4
        //COUNTS DOWN from 10 - 0 by 2
        for (int cnt = 10; cnt >= 0; cnt = cnt - 2) {
            System.out.println(cnt);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        //Question 5
        //Adds a column each row---

        //Outer loop Goes across columns
        for (int col = 1; col <= 5; col++)
        {
            //Inner loop Goes across rows
            for (int row = 1; row <= col; row++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("------------------------------------------------------------------------------------------");
        //Question 6
        //Adds a column each row---
        for (int col = 1; col <= 5; col++)
        {
            for (int row = col ;  row<= 5 ; row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("------------------------------------------------------------------------------------------");
        //Question 7
        //Adds a column each row---

        for (int cnt = 1; cnt <= 5; cnt ++)
        {
            for (int t=1; t<=5; t++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");
        //Question 8
        //Modify c to f converter

                Scanner in = new Scanner(System.in);

                //Declare Variables
                double C = 0;
                double F;
                boolean isNumber = true;
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
                        isNumber = false;
                        trash = in.nextLine();
                        System.out.println("'" + trash + "'" + " is not a number. Please retype temperature.");


                    }
                } while (isNumber == false);

                System.out.println("Please restart....");
        System.out.println("-------------------------------");

        //Extra Credit!!!
        //My Initial is a J...

        //Top line of J: 3 rows down
        for (int cnt = 1; cnt <= 3; cnt ++)
        {
            //For # of lines the * is (30)
            for (int t=1; t<=30; t++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //to help me seperate out the diferent sections

        //for the middle of J: (20 lines long)
        for (int i=1; i <= 20; i++)
        {
            {//So the line can start in the middle instead of the start.
            System.out.print("          " +"*****");}
            //So it spaces out the characters
            System.out.println();
        }
        //For the bottom part of J....3 lines long
        for (int i=1; i <= 3; i++)
        {
            {
                //So the line can start in the middle instead of the start.
                System.out.print("***************");
            }
            //So it spaces out the characters
            System.out.println();
        }









    }
}



