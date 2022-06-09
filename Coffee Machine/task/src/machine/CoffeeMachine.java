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

        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterMachineHave = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkMachineHave = scanner.nextInt();
        System.out.println("Write how many ml of water the coffee machine has: ");
        int coffeeGMachineHave = scanner.nextInt();
        System.out.println("Write how many cups: ");
        int cupsMachineMake = scanner.nextInt();

        int cupsCanMake = 0;

        if(waterMachineHave == waterNeeded && milkMachineHave == milkNeeded && coffeeGMachineHave == coffeeBeansNeeded){
            cupsCanMake = 1;
        }else {
            while(waterMachineHave >= waterNeeded && milkMachineHave >= milkNeeded && coffeeGMachineHave >= coffeeBeansNeeded){
                cupsCanMake++;
                waterMachineHave -=waterNeeded;
                milkMachineHave -= milkNeeded;
                coffeeGMachineHave -= coffeeBeansNeeded;
            }
        }

        int cupsOfCoffeeLeft = cupsCanMake - cupsMachineMake;

        if (cupsOfCoffeeLeft ==0){
            System.out.println("Yes, I can make that amount of coffee");
        }else if (cupsCanMake > cupsMachineMake) {
            System.out.println("Yes, I can make that amount of coffee (and even " + cupsOfCoffeeLeft + " than that)");
        } else if (cupsMachineMake > cupsCanMake) {
            System.out.println("No, I can make only " + cupsCanMake +  " cup(s) of coffee");
        }



    }
}
