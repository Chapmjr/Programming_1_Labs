package Lab_8_GetMethodical;

import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double getDouble;
        getDouble = SafeInput.getDouble(in, "Input any double value");
        System.out.println("Your double value is: "+getDouble+ "!");
    }

}
