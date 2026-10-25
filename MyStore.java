package mystore;
import java.util.Scanner;

public class MyStore {

    public static void main(String[] args) {

        final double MAX_BUDGET = 250.00;

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        int count = 0;

        while (true) {


            System.out.println("Available items:");
            
            System.out.println("T Shirt - $29.99");
            System.out.println("Shoes - $125.99");
            System.out.println("Jeans - $60.99");
            System.out.println("Jacket - $250.00");
            System.out.println("Hat - $25.99");
            System.out.println("Shorts - $75.99");
            System.out.println("Blouse - $88.99");
            System.out.println("Enter 'done' to finish shopping.");

            System.out.print("\nEnter an item: ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("done")) {
                break;
            }

            Item item = null;

            if (choice.equalsIgnoreCase("T Shirt")) {
                item = new Item("T Shirt", 29.99);
            } else if (choice.equalsIgnoreCase("Shoes")) {
                item = new Item("Shoes", 125.99);
            } else if (choice.equalsIgnoreCase("Jeans")) {
                item = new Item("Jeans", 60.99);
            } else if (choice.equalsIgnoreCase("Jacket")) {
                item = new Item("Jacket", 250.00);
            } else if (choice.equalsIgnoreCase("Hat")) {
                item = new Item("Hat", 25.99);
            } else if (choice.equalsIgnoreCase("Shorts")) {
                item = new Item("Shorts", 75.99);
            } else if (choice.equalsIgnoreCase("Blouse")) {
                item = new Item("Blouse", 88.99);
            }

            if (item == null) {
                System.out.println("Invalid item. Please try again.");
                continue;
            }

            if (total + item.getDblPrice() > MAX_BUDGET) {
                System.out.println("Warning: This item would put you over budget!");
                System.out.printf("Your budget is $%.2f.%n", MAX_BUDGET);
                System.out.printf("You have spent $%.2f so far.%n", total);
                continue;
            }

            total += item.getDblPrice();
            count++;

            System.out.println("\nAdded: " + item);
            System.out.println("Items purchased: " + count);
            System.out.printf("Total spent: $%.2f%n", total);
            System.out.printf("Remaining budget: $%.2f%n",
                    MAX_BUDGET - total);
        }

        System.out.println("\nThank you for shopping at MyStore!");
        System.out.println("Total items purchased: " + count);
        System.out.printf("Final total: $%.2f%n", total);

        input.close();
    }
}

class Item {

    private String strName;
    private double dblPrice;

    public Item(String strName, double dblPrice) {
        this.strName = strName;
        this.dblPrice = dblPrice;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public double getDblPrice() {
        return dblPrice;
    }

    public void setDblPrice(double dblPrice) {
        this.dblPrice = dblPrice;
    }

    public String toString() {
        return "Item: " + strName + ", Price: "
                + String.format("%.2f", dblPrice);
    }
}
