package Lab_6;

import java.util.Random;
import java.util.Scanner;

public class Ass_01RockPaperScissors {
    public static void main(String[] args) {
        //Numbers for 3 moves----Rock(1)-----Paper(2)-----Scissors(3)-----
        int r = 1;
        int p = 2;
        int s = 3;
        //Random move for Comp--------
        int compMove;
        Random compNum = new Random();
        compMove = compNum.nextInt(3) + 1;
        //Random move for User-----------
        int userMove;
        Random userNum = new Random();
        userMove = userNum.nextInt(3) + 1;
        //Scanner for User Move-------------
        Scanner scan = new Scanner(System.in);
        //boolean test for if value is number
        boolean isValid = true;
        //String for trash
        String trash;
        //boolean test for if the user wants to play again--------
        boolean playAgain = false;

        System.out.println("Ground RULES: Your input has to be 1-3, otherwise you will be directed to restart or quit.");
        System.out.println();
        System.out.println("HAVE FUN....Take time to read the messages.");
        System.out.println();
        do{
            do{
                System.out.println("Rock(1)....Paper(2)......Scissors(3)......Shoot!");
                System.out.println("Choose your move....Rock(1)....Paper(2)....Scissors(3).");
                //Scans for user input-----------
                if (scan.hasNextInt()){
                    userMove = scan.nextInt();
                    //Test for comp Rock------------------
                    if (compMove == 1) {
                        if (userMove == 1) {
                            System.out.println("(TIE)Rock and Rock.....We both lost it seems!!!");
                        } else if (userMove == 2) {
                            System.out.println("(WIN)...I chose Rock...You cover me...You win!!!");
                        } else if (userMove == 3) {
                            System.out.println("(Lost)...I chose Rock...You just got crushed!!!");
                        }
                        //Test for comp: Paper------------------
                    } else if (compMove == 2) {
                        if (userMove == 2) {
                            System.out.println("(TIE)Paper and Paper...What are we...a notebook???");
                        } else if (userMove == 1) {
                            System.out.println("(LOST)I cover you!!! I won!!!");
                        } else if (userMove == 3) {
                            System.out.println("(You WIN)Ouch....You cut me(Cries)...You win!!!!");
                        }
                        //Test for comp: Scissors------------------
                    } else if (compMove == 3) {
                        if (userMove == 3) {
                            System.out.println("(TIE)...We cut each other....Stop the Violence!!!!!");
                        } else if (userMove == 1) {
                            System.out.println("(YOU WIN)...How dare you crush me...I'll win next time!!!");
                        } else if (userMove == 2) {
                            System.out.println("(I WIN)...I cut you into little tiny pieces(Evil Laugh)");
                        }
                    }
                    //this is for when the input isn't valid----
                }else if (scan.hasNextLine()) {
                    trash = scan.nextLine();
                    System.out.println("How dare you try to break me!!!");
                }
                //This prompts the user for a restart----------
                System.out.println("Play again? Yes = 1......No = 2");
                if (scan.hasNextInt()){
                userMove = scan.nextInt();
                if (userMove == 1) {
                    playAgain = true;
                } else if (userMove == 2) {
                    playAgain = false;
                }
                }
                else if (scan.hasNextLine()) {
                    trash = scan.nextLine();
                    System.out.println("Stop you CAN'T Break me....Now I'm MAD....FORCE RESTART(Beep...Boop)");
                    isValid = false;}

            }while (isValid == false);


        }while (playAgain == true);


    }
}
