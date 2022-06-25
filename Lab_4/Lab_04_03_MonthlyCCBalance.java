package Lab_4;

public class Lab_04_03_MonthlyCCBalance {
    public static void main(String...args){

        //Declare Variables
        int cardBalance = 5000;
        double interestRate = .17;
        //Month Total Calculator
        double monthOne = cardBalance + (interestRate * cardBalance);
        double monthTwo = monthOne + (monthOne * interestRate);

        System.out.println("The interest due after 1 month is: " + monthOne + " assuming the user doesn't pay.");

        System.out.println("The interest due after 2 months is: " + monthTwo + " assuming the user doesn't pay.");
}}
