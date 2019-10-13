package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = scanner.nextInt();
        int milk = scanner.nextInt();
        int beans = scanner.nextInt();
        int cupsNeeded = scanner.nextInt();
        int cupsAvailable = Math.min(water/200, Math.min(milk/50, beans/15));

        System.out.println("Write how many ml of water the coffee machine has: " + water);
        System.out.println("Write how many ml of milk the coffee machine has: " + milk);
        System.out.println("Write how many grams of coffee beans the coffee machine has: " + beans);
        System.out.println("Write how many cups of coffee you will need: " + cupsNeeded);

        if (cupsNeeded == cupsAvailable) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsNeeded > cupsAvailable) {
            System.out.println("No, I can make only " + cupsAvailable + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsAvailable - cupsNeeded) + " more than that)");
        }
    }
}
