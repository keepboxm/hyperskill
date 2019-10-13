package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static int money = 550;
    static int water = 1200;
    static int milk = 540;
    static int beans = 120;
    static int disCups = 9;

    public static void main(String[] args) {

        int enter = 0;

        machineHas();

            System.out.print("Write action (buy, fill, take): ");
            Scanner scan = new Scanner(System.in);
            String action = scan.nextLine();
            System.out.println();

            if (action.equals("buy")) {
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                enter = scan.nextInt();
                System.out.println();
                if (enter == 1) { // espresso
                    water = water - 250;
                    beans = beans - 16;
                    money = money + 4;
                    disCups = disCups - 1;
                } else if (enter == 2) { // latte
                    water = water - 350;
                    milk = milk - 75;
                    beans = beans - 20;
                    money = money + 7;
                    disCups = disCups - 1;
                } else if (enter == 3) { // capucino
                    water = water - 200;
                    milk = milk - 100;
                    beans = beans - 12;
                    money = money + 6;
                    disCups = disCups - 1;
                }
                machineHas();
            } else if (action.equals("fill")){
                System.out.print("Write how many ml of water do you want to add: ");
                water = water + scan.nextInt();
                System.out.println();
                System.out.print("Write how many ml of milk do you want to add: ");
                milk = milk + scan.nextInt();
                System.out.println();
                System.out.print("Write how many grams of coffee beans do you want to add: ");
                beans = beans + scan.nextInt();
                System.out.println();
                System.out.print("Write how many disposable cups of coffee do you want to add: ");
                disCups = disCups + scan.nextInt();
                System.out.println();
                machineHas();
            } else if (action.equals("take")){
                System.out.println("I gave you $" + money);
                money = 0;
                machineHas();
            }
    }

    public static void machineHas (){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of beans");
        System.out.println(disCups + " of disposable cups");
        System.out.println(money + " money");
    }
}
