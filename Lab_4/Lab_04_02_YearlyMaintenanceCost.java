package Lab_4;

public class Lab_04_02_YearlyMaintenanceCost {
    public static void main(String...args){

        int costWinter = 50;
        int costSpring = 35;
        int costSummer = 90;
        int costFall = 70;

        int yearlyCost = costWinter + costSpring + costSummer + costFall;

        System.out.println("The total yearly maintenance cost is $" + yearlyCost + " when winter = $" + costWinter + ", Spring = $" + costSpring + ", Summer = $" + costSummer + ", and Fall = $" + costFall);
    }
}
