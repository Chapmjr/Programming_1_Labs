package Lab_8_GetMethodical;
import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int intValue;
        intValue = SafeInput.getInt(in, "What is your favorite Integer?");
        System.out.println("\n Your favorite integer is: " +intValue);
    }
}
