package Lab_5;

public class Lab_05_02_BirthMonth {
    public static void main(String...args){

        int birthMonth = 1 - 12;

        int userMonth = -1;

        if (userMonth < 1)
        {
            System.out.println("You entered an incorrect birth month value: " + userMonth);
        }
        else if (userMonth <= 12)
        {
            System.out.println("Your birth month is: " + userMonth);
        }
        else if (userMonth > 12)
        {
            System.out.println("You entered an incorrect birth month value: " + userMonth);
        }






    }
}
