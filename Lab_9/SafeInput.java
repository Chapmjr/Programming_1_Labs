package Lab_9;

import java.util.Scanner;

public class SafeInput {

    //Part A: getNonZeroLenString -------------------------------------------------------------------------------------
    public static String getNonZeroLenString(Scanner in, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t 0 length
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = in.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    //Part B getInt -------------------------------------------------------------------------------------
    public static int getInt(Scanner in, String prompt) {
        int intValue = 0;
        String trash;
        boolean isValid = false;


        do {
            do {
                System.out.print("\n" + prompt + ": "); //prompt will say input any integer.
                if (in.hasNextInt()) {
                    intValue = in.nextInt();
                    isValid = false;
                } else if (in.hasNextLine()) {
                    trash = in.nextLine();
                    isValid = true;
                }
            } while (isValid == true); //Goes with 2nd "Do"

        } while (intValue == 0);

        return intValue;
    }

    //Part C: getDouble ---------------------------------------------------------------------------------
    public static double getDouble(Scanner in, String prompt) {
        double anyDouble = 0;
        String trash;
        Boolean isValid = true;

        do {
            do {
                System.out.print("\n" + prompt + ": "); //prompt will say "Input any Double Value

                //TEST FOR USER INPUT...
                if (in.hasNextDouble() || in.hasNextInt()) {
                    anyDouble = in.nextDouble();
                    isValid = true;
                } else if (in.hasNextLine()) {
                    trash = in.nextLine();
                    isValid = false;
                }
            } while (isValid == false); //2nd DO
        } while (anyDouble == 0); //1st Do
        return anyDouble;
    }

    //Part D: getRangedInt ----------------------------------------------------------------
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        pipe = new Scanner(System.in);
        int ihigh,ilow;

        double userRow,userCol; //rmr to change back to dlow\dhigh---

        String str;

        /*

         * Creating an Scanner class object which is used to get the inputs

         * entered by the user

         */



        str=prompt;

        while(true)

        {


            System.out.print(prompt);

            userRow=pipe.nextDouble();

            System.out.print(prompt);

            userCol=pipe.nextDouble();

            double val=getRangedDouble(pipe,str,userRow,userCol);

            System.out.println(""+val);

            char ch=getYNConfirm(pipe);

            if(ch=='Y' || ch=='y')

            {

                continue;

            }

            else

            {

                break;

            }

        }

    return  low;}



    private static char getYNConfirm(Scanner pipe) {

        while(true)

        {

            System.out.print("Do you want to continue(Y/N) ::");

            char ch = pipe.next(".").charAt(0);

            if(ch=='Y'||ch=='y')

                return ch;

            else if(ch=='N' || ch=='n')

                return ch;

            else

                continue;

        }

    }

    private static double getRangedDouble(Scanner pipe, String str, double dlow, double dhigh) {

        double num=0;

        System.out.print(str+" ["+dlow+" - "+dhigh+"] :");

        pipe.nextLine();

        while(true)

        {

            num=Double.parseDouble(pipe.nextLine());

            if(num<dlow || num>dhigh)

            {

                System.out.println("** Invalid.Must be in Range **");

                System.out.print(str+" ["+dlow+" - "+dhigh+"]");

            }

            else

                break;

        }

        return num;

    }

    //private static int getRangedInt(Scanner pipe, String str, int ilow, int ihigh) {

      //  int num=0;

        //System.out.print(str+" ["+ilow+" - "+ihigh+"] :");

       // pipe.nextLine();

     //   while(true)

       // {

         //   num=Integer.parseInt(pipe.nextLine());

           // if(num<ilow || num>ihigh)

           // {

             //   System.out.println("** Invalid.Must be in Range **");

               // System.out.print(str+" ["+ilow+" - "+ihigh+"]");

           // }

           // else

             //   break;

       // }

       // return num;

    //}

    //Part E: getRangedDouble ---------------------------------------------------------------------------------------
 //   public static double getRangedDouble(Scanner in, String prompt, double low, double high) {
 //       String trash;
   //     boolean isValid = true;

     //   double itemPrice = 0;
       // do {
         //   System.out.print("\n" + prompt); ///Ask for double value.....
            //test if user value is valid
           // if (in.hasNextDouble() || in.hasNextInt()) {
               // high = in.nextDouble();
             //   isValid = true;
          //  } else if (in.hasNextLine()) {
            //    trash = in.nextLine();
              //  isValid = false;
           // }
      //  } while (isValid == false);
     //   double total = high;
      //  System.out.print("Your item price is: " + high);
       // return high;
   // }

    //Part F: getYNConfirm-------------------------------
    public static boolean getYNConfirm(Scanner in, String prompt) {
        boolean isValid = true;
        String Yes = "Y";
        String No = "N";
        String trash;
        boolean answer = true;

        {
            System.out.print(prompt); //Prompt: Part H: Something dealing with the "Pretty Header"
                if (in.nextLine().equals("y"))//Test for Yes No and Trash
                {
                    isValid = true;
                    answer = true;
                    System.out.println("Your answer is 'Yes'");
                }
                else if (in.nextLine().equals("n"))
                {
                    isValid = true;
                    answer = false;
                    System.out.print("Your answer is 'No'");
                } else //Loop for when input is trash
                {
                    trash = in.nextLine();
                    isValid = false;
                }
        return answer;
        }
    }
}

