package Lab_6;

import java.util.Random;
import java.util.Scanner;


public class Lab_06_05_HighorLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //----Declare Variables----
        int max = 10;
        int min = 1;
        Random userGuess = new Random();
        //User Guess-----------
        int val1to10User;
        val1to10User = userGuess.nextInt(10) + 1;
        //Random computer Number I THINK-----
        Random compGuess = new Random();
        int val1to10Comp;
        val1to10Comp = compGuess.nextInt(10) + 1;
        boolean isValid = true;
        String notNumber;

        Random rnd = new Random();

        //--------PROMPT---------\
          do {
            System.out.println("Guess my number. [1 - 10]");
            if (scan.hasNextInt()) {
                val1to10User = scan.nextInt();
                if (val1to10User > val1to10Comp) {
                    isValid = false;
                    System.out.println("High...Try Again");
                } else if (val1to10User < val1to10Comp) {
                    isValid = false;
                    System.out.println("Low...Try Again.");
                } else if (val1to10User == val1to10Comp) {
                    isValid = true;
                    System.out.println("Congrats...You Guessed Right!!!!");
                }
            } else if (scan.hasNextLine()) {
                notNumber = scan.nextLine();
                System.out.println(notNumber + " is not a number...Try Again");
                isValid = false;
            }
        } while (isValid == false);
    }
}


