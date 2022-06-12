package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int money$ = 550;
    static int waterMl = 400;
    static int milkMl = 540;
    static int coffeeBeansG = 120;
    static int emptyCups = 9;
    public static void main(String[] args) {
        boolean stop = false;
        while(!stop) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> take();
                case "remaining" -> info();
                case "exit" -> stop = true;
            }
        }
    }
    public static void info () {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", waterMl);
        System.out.printf("%d ml of milk\n", milkMl);
        System.out.printf("%d g of coffee beans\n", coffeeBeansG);
        System.out.printf("%d disposable cups\n", emptyCups);
        System.out.printf("$%d of money\n", money$);
    }

    public static void buy() {
        System.out.println();
        System.out.print("What do you want to buy? ");
        System.out.println("1 - espresso, 2 latte, 3 capuccino:");
        String coffeeType = scanner.next();
        switch (coffeeType) {
            case "1" -> checking(250, 0, 16, 4);
            case "2" -> checking(350, 75, 20, 7);
            case "3" -> checking(200, 100, 12, 6);
        }
    }
    public static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        waterMl += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milkMl += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeansG += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        emptyCups += scanner.nextInt();
    }
    public static void take() {
        System.out.printf("I gave you $%d\n", money$);
        System.out.println();
        money$ = 0;
    }
    public static void checking(int water, int milk, int coffee, int money) {
        if ((waterMl - water) < 0) {
            System.out.println("Sorry, not enough water!");
        } else if (milkMl - milk < 0) {
            System.out.println("Sorry, not enough milk!");
        } else if ((coffeeBeansG - coffee) < 0) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (emptyCups == 0) {
            System.out.println("Sorry, not enough disposable cups");
        } else {
            waterMl -= water;
            milkMl -= milk;
            coffeeBeansG -= coffee;
            money$ += money;
            emptyCups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }
}