package Lab_8_GetMethodical;

import java.util.Objects;
import java.util.Scanner;

public class DevTest_SamplePrograms
{
    public static void main(String[] args)

            //Part A: Get UserName
    {
       Scanner in = new Scanner(System.in);
    //    String firstName = "";
    //    String lastName = "";
    //    firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
    //   lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
    //   System.out.println("\nYour full name is: " + firstName + " " + lastName);


      //Part B: getInt...Favorite Number
     //   int intValue;
     //   intValue = SafeInput.getInt(in, "What is your favorite Integer?");
     //   System.out.println("\n Your favorite integer is: " +intValue);

        //Part C: getDouble....

     // double getDouble;
    // getDouble = SafeInput.getDouble(in, "Input any double value");
     //System.out.println("Your double value is: "+getDouble+ "!");


        //Part D: getRangedInt....Date and Time of Birth--
        int getRangedInt;
        int getRangedIntMonth;
        int getRangedIntDay;
        int getRangedIntHour;
        int getRangedIntMin;

     // getRangedInt = SafeInput.getRangedInt(in, "Input Birth Year [1950 - 2010]: ",1950 ,2010 );
      //getRangedIntMonth = SafeInput.getRangedInt(in, "Input Birth Month [1 - 12]: ",1 ,12 );
      //getRangedIntDay = SafeInput.getRangedInt(in, "Input Birth Day [1 - 31]: ",1 ,31 );
      //getRangedIntHour = SafeInput.getRangedInt(in, "Input Birth hour [1 - 24]: ",1 ,24 );
      //getRangedIntMin = SafeInput.getRangedInt(in, "Input Birth Minute [1 - 59]: ",1 ,59 );
      //System.out.print("\n You were born on: ["+getRangedIntMonth+ "/" +getRangedIntDay+ "/" +getRangedInt+ "]"
          //    + " at the time of: " +getRangedIntHour+ ":" +getRangedIntMin);

        //Part E: getRangedDouble.........
        boolean answer = false;
        double userVal = 0;
        double total;
        double itemPrice = 0;
        String response;
        do {
            double getRangedDouble = 0;
            getRangedDouble = SafeInput.getRangedDouble(in, "What is the price of your item?", .50, 9.99);

            //Part F: getYNConfirm

            answer = SafeInput.getYNConfirm(in, "Do you want to continue?");

        }while (answer == true );
    }
}


