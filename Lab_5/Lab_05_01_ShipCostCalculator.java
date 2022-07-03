package Lab_5;

public class Lab_05_01_ShipCostCalculator {
    public static void main(String...args){

        //Variable Declaration
        double itemPrice = 105;
        double shipCost = .02 * itemPrice;
        double totalPrice;

        if (itemPrice >= 100) {
            totalPrice = itemPrice;
            System.out.println("The total price is $" + totalPrice + " with free shipping because item is $100.");
        }
        else {
            totalPrice = itemPrice + shipCost;
            System.out.println("The total price is: $" + totalPrice + " and the shipping cost is: $" + shipCost + ".");
        }
        }
    }

