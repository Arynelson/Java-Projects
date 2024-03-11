package Pizzeria;

import java.util.Scanner;

public class PizzeriaManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Pizzeria Gem's!");

        // Ask for the waiter's name
        System.out.println("Please enter the initial letter of the waiter's name (S for Sanclair, G for Gianni, or C for Carol):");
        char waiterInitial = scanner.nextLine().toUpperCase().charAt(0);

        String waiterName;
        double additionalCharge = 0;

        switch (waiterInitial) {
            case 'S':
                waiterName = "Sanclair";
                additionalCharge = 1; // Additional charge per person for dine-in
                break;
            case 'G':
                waiterName = "Gianni";
                additionalCharge = 1; // Additional charge per person for dine-in
                break;
            case 'C':
                waiterName = "Carol";
                additionalCharge = 1; // Additional charge per person for dine-in
                break;
            default:
                waiterName = "Unknown";
                additionalCharge = 1; // Additional charge per person for dine-in
                break;
        }

        // Ask for the table number or specify takeaway
        System.out.println("Please enter the table number (1 to 28) or 99 for takeaway:");
        int tableNumber = scanner.nextInt();

        // Variables for order details
        String orderType;
        String address = "";
        int numberOfPeople = 0;

        if (tableNumber == 99) {
            orderType = "Takeaway";
            scanner.nextLine(); // Consume newline character
            System.out.println("Please enter the delivery address:");
            address = scanner.nextLine();
        } else {
            orderType = "Dine-in";
            System.out.println("Please enter the number of people:");
            numberOfPeople = scanner.nextInt();
        }

        // Pizza menu
        String[] pizzas = {"Peperoni", "4 Formaggio", "Margherita", "Bacon", "Bontá", "Vegetarian", "Al sea"};
        double[] pizzaPrices = {8.5, 9.5, 7.5, 9, 8, 7, 8.5};

        // Take pizza order
        System.out.println("How many pizzas would you like to order?");
        int numPizzas = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        double pizzaTotal = 0;
        for (int i = 0; i < numPizzas; i++) {
            System.out.println("Please choose pizza " + (i + 1) + " from the menu:");
            for (int j = 0; j < pizzas.length; j++) {
                System.out.println((j + 1) + ". " + pizzas[j] + " - " + pizzaPrices[j] + " euros");
            }
            int pizzaChoice = scanner.nextInt();
            pizzaTotal += pizzaPrices[pizzaChoice - 1];
        }

        // Drinks menu
        String[] drinks = {"Beer", "Water", "Soda", "Juice", "Spritz"};
        double[] drinkPrices = {4, 1, 3.3, 2.5, 5};

        // Take drink order
        System.out.println("How many drinks would you like to order?");
        int numDrinks = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        double drinkTotal = 0;
        for (int i = 0; i < numDrinks; i++) {
            System.out.println("Please choose drink " + (i + 1) + " from the menu:");
            for (int j = 0; j < drinks.length; j++) {
                System.out.println((j + 1) + ". " + drinks[j] + " - " + drinkPrices[j] + " euros");
            }
            int drinkChoice = scanner.nextInt();
            drinkTotal += drinkPrices[drinkChoice - 1];
        }

        // Dessert menu
        String[] desserts = {"Tiramisu", "Ice Cream"};
        double[] dessertPrices = {5.7, 5};

        // Take dessert order
        System.out.println("How many desserts would you like to order?");
        int numDesserts = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        double dessertTotal = 0;
        for (int i = 0; i < numDesserts; i++) {
            System.out.println("Please choose dessert " + (i + 1) + " from the menu:");
            for (int j = 0; j < desserts.length; j++) {
                System.out.println((j + 1) + ". " + desserts[j] + " - " + dessertPrices[j] + " euros");
            }
            int dessertChoice = scanner.nextInt();
            dessertTotal += dessertPrices[dessertChoice - 1];
        }

        // Calculate total bill
        double totalBill = pizzaTotal + drinkTotal + dessertTotal + (additionalCharge*numberOfPeople);

        // Display order details
        System.out.println("\nOrder Summary:");
        System.out.println("Waiter: " + waiterName);
        System.out.println("Table Number: " + tableNumber);
        if (orderType.equals("Takeaway")) {
            System.out.println("Delivery Address: " + address);
            System.out.println("Delivery Fee: 4 euros");
        } else {
            System.out.println("Number of People: " + numberOfPeople);
            System.out.println("Additional Charge per Person: " + additionalCharge + " euros");
        }
        System.out.println("Pizzas: " + numPizzas + " - Total: " + pizzaTotal + " euros");
        System.out.println("Drinks: " + numDrinks + " - Total: " + drinkTotal + " euros");
        System.out.println("Desserts: " + numDesserts + " - Total: " + dessertTotal + " euros");
        System.out.println("Total Bill: " + totalBill + " euros");

        
        System.out.println("Thank you for your order. Enjoy your meal!");
      
    }
}
