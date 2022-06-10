package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Starting to make a coffee");System.out.println("Grinding coffee beans");System.out.println("Boiling water");System.out.println("Mixing boiled water with crushed coffee beans");System.out.println("Pouring coffee into the cup");System.out.println("Pouring some milk into the cup");System.out.println("Coffee is ready!");

        //Task 2
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

        //Task 3
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

        // Buy Fill Take
        nt waterInMachine = 400;
        int milkInMachine = 540;
        int coffeeInMachine = 120;
        int disCupsInMachine = 9;
        int moneyInMachine = 550;
        System.out.println("The coffee machine has: ");
        System.out.println(waterInMachine + " ml of water");
        System.out.println(milkInMachine + " ml of milk");
        System.out.println(coffeeInMachine + " g of coffee beans");
        System.out.println(disCupsInMachine + " disposable cups");
        System.out.println("$" +moneyInMachine + " of money");
        System.out.println("Write action (buy, fill, take)");
        String choice = scanner.nextLine();

        switch (choice){
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int  option = Integer.parseInt(scanner.nextLine());

                switch (option){
                    case 1:
                        waterInMachine -= 250;
                        coffeeInMachine -= 16;
                        moneyInMachine += 4;
                        disCupsInMachine -=1;
                        System.out.println("The coffee machine has: ");
                        System.out.println(waterInMachine + " ml of water");
                        System.out.println(milkInMachine + " ml of milk");
                        System.out.println(coffeeInMachine + " g of coffee beans");
                        System.out.println(disCupsInMachine + " disposable cups");
                        System.out.println("$" +moneyInMachine + " of money");
                        break;
                    case 2:
                        waterInMachine -= 350;
                        milkInMachine -= 75;
                        coffeeInMachine -= 20;
                        moneyInMachine += 7;
                        disCupsInMachine -=1;
                        System.out.println("The coffee machine has: ");
                        System.out.println(waterInMachine + " ml of water");
                        System.out.println(milkInMachine + " ml of milk");
                        System.out.println(coffeeInMachine + " g of coffee beans");
                        System.out.println(disCupsInMachine + " disposable cups");
                        System.out.println("$" +moneyInMachine + " of money");
                        break;
                    case 3:
                        waterInMachine -= 200;
                        milkInMachine -= 100;
                        coffeeInMachine -= 12;
                        moneyInMachine += 6;
                        disCupsInMachine -=1;
                        System.out.println("The coffee machine has: ");
                        System.out.println(waterInMachine + " ml of water");
                        System.out.println(milkInMachine + " ml of milk");
                        System.out.println(coffeeInMachine + " g of coffee beans");
                        System.out.println(disCupsInMachine + " disposable cups");
                        System.out.println("$" +moneyInMachine + " of money");
                }
            break;

            case "fill":
                System.out.println("Write how many ml of water you want to add: ");
                int waterWantedToAdd = Integer.parseInt(scanner.nextLine());
                int waterAfterAdd = waterInMachine + waterWantedToAdd;

                System.out.println("Write how many ml of milk you want to add: ");
                int milkWantedToAdd = Integer.parseInt(scanner.nextLine());
                int milkAfterAdd = milkInMachine + milkWantedToAdd;

                System.out.println("Write how many grams of coffee beans you want to add: ");
                int coffeeWantedToAdd = Integer.parseInt(scanner.nextLine());
                int coffeeAfterAdd = coffeeInMachine + coffeeWantedToAdd;

                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int cupWantedToAdd = Integer.parseInt(scanner.nextLine());
                int cupAfterAdd = disCupsInMachine + cupWantedToAdd;


                System.out.println("The coffee machine has: ");
                System.out.println(waterAfterAdd + " ml of water");
                System.out.println(milkAfterAdd + " ml of milk");
                System.out.println(coffeeAfterAdd + " g of coffee beans");
                System.out.println(cupAfterAdd + " disposable cups");
                System.out.println("$" +moneyInMachine + " of money");

                break;

            case "take":

                System.out.println("I gave you $" + moneyInMachine + " \n" );
                System.out.println("The coffee machine has: ");
                System.out.println(waterInMachine + " ml of water");
                System.out.println(milkInMachine + " ml of milk");
                System.out.println(coffeeInMachine + " g of coffee beans");
                System.out.println(disCupsInMachine + " disposable cups");
                System.out.println("$0 of money");
                break;


        }


    }
}
