package Lab_8_GetMethodical;
import java.util.Scanner;


public class Reggie {
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        String ssn ="";
        String mNumber = "";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(pipe, "enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        ssn = pipe.nextLine();
        System.out.println("SSN: "+ssn);

        mNumber = SafeInput.getRegExString(pipe, "Enter your M number", "(M|n)\\d{5}");
        mNumber = pipe.nextLine();
        System.out.println("mNumber: "+mNumber);

        menuChoice = SafeInput.getRegExString(pipe, "Enter your choice\n\t0 - Open\n\tS - Save\n\tV - View\n\tQ - Quit", "{OoSsVvQq]");
        menuChoice = pipe.nextLine();
        System.out.println("menuChoice: " +menuChoice);
    }
}
