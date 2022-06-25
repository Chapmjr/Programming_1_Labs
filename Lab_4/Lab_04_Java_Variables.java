package Lab_4;

public class Lab_04_Java_Variables
{
    public static void main(String[] args)
    {
        //Variables A and B
        int intOperandA = 26;
        int intOperandB = 3 ;
        //List of Operations
        int intSum ;
        int intProduct ;
        int intDifference  ;
        int intQuotient  ;
        int intModulo  ;



        double doubleOperandA;
        double doubleOperandB;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        System.out.println("THIS IS PART 1");
        System.out.println("______________");

        //Assignments Using int Operations
        intSum = intOperandA + intOperandB; // Assignment +

            System.out.println("The sum of using units of " + intOperandA + ", " + intOperandB + ", is " + intSum);

        intProduct = intOperandA * intOperandB; //Assignment *

            System.out.println("The Prduct of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;

            System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;

            System.out.println("The Quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA - (intQuotient * intOperandB);
            System.out.println("The remainder of dividing, " + intOperandA + " and " + intOperandB + " = " + intModulo);

        //Assignments using double Operations

        doubleOperandA = intOperandA * 2;

            System.out.println("Variable A, " + intOperandA + " doubled is " + doubleOperandA);


        doubleOperandB = intOperandB * 2;
            System.out.println("Variable B, " + intOperandB + " doubled is " + doubleOperandB);

        doubleSum = intSum * 2;
            System.out.println("The Sum, "+ intSum + " doubled is " + doubleSum);

        doubleProduct = intProduct * 2;
            System.out.println("The Product, " + intProduct + " doubled is " + doubleProduct);

        doubleDifference = intDifference * 2;
            System.out.println("The Difference, " + intDifference + " doubled is " + doubleDifference);

        doubleQuotient = intQuotient * 2;
            System.out.println("The Quotient, " + intQuotient + " doubled is " + doubleQuotient);


            System.out.println();
            System.out.println("THIS IS PART 2"); System.out.println("______________");

        //Cost of lunch
        double myLunchCost = 12.50;
                System.out.println("The cost of my lunch is $" + myLunchCost + ".");

        int numberOfKids = 6;
            System.out.println("The number of kids in my family is " + numberOfKids + ".");

        boolean isRaining;
        isRaining = false;
        double priceOfGas = 4.93;
        int favNumber = 12;
        int shoeSize = 9;
        String birthMonth = "November";
        String firstName = "Josh";
        String lastName = "Chapman";
        String fullName;
                //Is it Raining
            System.out.println("Is it raining? " + isRaining);

        //Price of Gas
        System.out.println("The price of gas in ohio(on average) is " + priceOfGas);

        //Birth Month
        System.out.println("My birth month is " + birthMonth);

        //Full Name
        System.out.println("My full name is "+ firstName + " "+ lastName + ".");

        //Favorite Number
        System.out.println("My favorite number is " + favNumber);

        //Shoe size
        System.out.println("My shoe size is " + shoeSize);



    }
}