package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        System.out.println("Starting to make a coffee");System.out.println("Grinding coffee beans");System.out.println("Boiling water");System.out.println("Mixing boiled water with crushed coffee beans");System.out.println("Pouring coffee into the cup");System.out.println("Pouring some milk into the cup");System.out.println("Coffee is ready!");

        int waterNeeded = 200;
        int milkNeeded = 50;
        int coffeeBeansNeeded = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of cups: ");
        int cupOfCoffee = scanner.nextInt();

        System.out.println("For " + cupOfCoffee + " cups of coffee you will need: ");
        System.out.println(cupOfCoffee * waterNeeded + " ml of water");
        System.out.println(cupOfCoffee * milkNeeded + " ml of milk");
        System.out.println(cupOfCoffee * coffeeBeansNeeded + " g of coffee beans");

        System.out.println("Hello GitHub");

        System.out.println("Coded in PC");


    }
}
