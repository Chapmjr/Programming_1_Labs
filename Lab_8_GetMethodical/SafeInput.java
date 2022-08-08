package Lab_8_GetMethodical;

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
    public static int getRangedInt(Scanner in, String prompt, int low, int high) {
        boolean isValid = true;
        String trash;
        int getRangedInt = 0;
        int getRangedIntMonth = 0;
        int getRangedIntDay = 0;
        int getRangedIntHour = 0;
        int getRangedIntMin;


        do { //For testing if input is valid
            System.out.print("\n" + prompt); //prompt: What is your low/high value.......In our case, we are finding the exact date/time the user was born
            //Test for if (low) value is Int...
            if (in.hasNextInt()) {
                do//Test for if Value is Feb
                {
                    if (getRangedIntMonth == 2) {
                        if (getRangedIntDay <= 28) {
                            isValid = true;
                        } else if (getRangedIntDay > 28)//For if Day is higher than 28
                        {
                            System.out.print("Sorry, you entered a wrong date for February. PLease Try Again");
                            isValid = false;
                        }

                    }//Connected to Month of February
                } while (isValid == false);//For Month of Feb if Day is wrong
                high = in.nextInt();
                isValid = true;
            } else if (in.hasNextLine()) {
                trash = in.nextLine();
                isValid = false;
            }

        } while (isValid == false);
        return high;
    }

    //Part E: getRangedDouble ---------------------------------------------------------------------------------------
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        String trash;
        boolean isValid = true;

        double itemPrice = 0;
        {
            System.out.print(prompt);
            prompt = pipe.next();
            double range = high - low;
            String ap = String.valueOf(prompt) + range;
            System.out.println("RESULT IS : " + ap);
            return 0;




        //Part F: getYNConfirm-------------------------------
    }}public static boolean getYNConfirm(Scanner in, String prompt) {
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

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
         pipe = new Scanner (System.in);
        System.out.print(prompt);

         return regEx;}
}

