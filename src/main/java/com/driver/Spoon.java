package com.driver;

import java.util.Scanner;

public class Spoon {
    private String name;
    private int quantity;

    public Spoon(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
    	//your code goes here
        return name;
    }

    public int getQuantity() {
    	//your code goes here
        return quantity;
    }

    public void setQuantity(int quantity) {
    	//your code goes here
        this.quantity = quantity;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpoonInventory inventory = new SpoonInventory();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a Spoon Type");
            System.out.println("2. Retrieve Spoon Details");
            System.out.println("3. Compute Total Spoons");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Spoon Name:");
                    String name = scanner.nextLine();
                    System.out.println("Quantity:");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    inventory.addSpoonType(name, quantity);
                    break;
                case 2:
                    System.out.println("Spoon Name:");
                    String spoonName = scanner.nextLine();
                    inventory.retrieveSpoonDetails(spoonName);
                    break;
                case 3:
                    int totalSpoons = inventory.computeTotalSpoons();
                    System.out.println("Total spoons in inventory: " + totalSpoons);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
