package Lab_7;

import java.util.Random;
import java.util.Scanner;

public class Ass_02_Craps {
    public static void main(String[] args) {

        //Declare Variables

        //String for Trash input
        String trash;

        //Scanner for if user wants to play again
        Scanner scan = new Scanner(System.in);
        int userChoice;
        Random rnd = new Random();
        int rndBirthMonthOff = rnd.nextInt(12);
        int rndBirthMonth = rnd.nextInt(12) + 1;

        int dieOff = rnd.nextInt(6);
        int die = rnd.nextInt(6) + 1;

        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int sum = die1 + die2;
        //for 2nd round of die rolls
        int newDie1 = rnd.nextInt(6) + 1;
        int newDie2 = rnd.nextInt(6) + 1;
        int sum2 = newDie1 + newDie2;

        int crapsRoll = die1 + die2;

        //isValid input?
        boolean isValid = true;

        //For looping
        boolean PlayAgain = false;

        do {
            System.out.println();
        } while (PlayAgain == true);

        //Step 1: roll 2 dice
        // if sum of dice is 2,3, or 12, then you CRAP and lose

        // if sum is 7 or 11 then 'natural'....you win

        // Anything else becomes 'point' that the user tries to get

        do {
            do{//Results for Die 1 and Die 2 on 1st try
            System.out.println("Die 1");
            System.out.println(die1);
            System.out.println();
            System.out.println("Die 2");
            System.out.println(die2);

            if (die1 + die2 == 2 || die1 + die2 == 3 || die1 + die2 == 12) {
                System.out.println("Sorry, you crapped out wit a value of " + sum);
            } else if (die1 + die2 == 7 || die1 + die2 == 11) {
                System.out.println("Congrats! you got a natural...");
                System.out.println("You win!!!");
            } else //Executes if nothing else is true...
            {
                //Indicator for new point
                System.out.println("New Point");
                System.out.println(newDie1 + newDie2);

                //Start of new roll using new point
                System.out.println("New Die1");
                System.out.println(newDie1);
                System.out.println("New Die2");
                System.out.println(newDie2);

                if (newDie1 + newDie2 == sum2) {
                    System.out.println();
                    System.out.println("Congrats you got " + sum2 + " Which was the new point");
                } else if (newDie1 + newDie2 == 7) {
                    System.out.println("Sorry you lost this round because you got a 7.");
                }
                System.out.println("Play again? Yes = 1......No = 2");
                if (scan.hasNextInt()) {
                    userChoice = scan.nextInt();
                    if (userChoice == 1) {
                        PlayAgain = true;
                    } else if (userChoice == 2) {
                        PlayAgain = false;
                    } else if (scan.hasNextLine()) {
                        trash = scan.nextLine();
                        isValid = false;
                        System.out.println("Stop you CAN'T Break me....Now I'm MAD....FORCE RESTART(Beep...Boop)");
                        PlayAgain = true;
                    }
                }
                }
            }while (isValid == false);


        } while (PlayAgain == true);

    }

}



    


