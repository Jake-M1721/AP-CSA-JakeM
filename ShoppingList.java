/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package shoppinglist;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author jmillard2027
 */
public class ShoppingList {


    public static void main(String[] args) {
        
        
      String another = "y";
      Scanner scan = new Scanner(System.in); 
      
    //creates an array list of items
      ArrayList<ShoppingListItem> list = new ArrayList<ShoppingListItem>();
      
      
     //loop to allow user to add as many items as they want
     while(another.equalsIgnoreCase("y")){
      
      //asks user to input the name, price, and quantity for an item in the shopping list
      System.out.println("Enter in the name of the item to add to the list: "); 
      String itemName = scan.nextLine();
      System.out.println("Enter in the price of the item to add to the list: "); 
      double itemPrice = scan.nextDouble();  
      System.out.println("Enter the quantity you want to buy");
      int itemQuantity = scan.nextInt();
      scan.nextLine();
      
      //creates an object that the user's values are put into
      ShoppingListItem item = new ShoppingListItem(itemName, itemPrice, itemQuantity);
      

      //adds each item to the list
      list.add(item);
      
      //prompts user to decide if they want to add more items
      System.out.println("Do you want to enter another item? (y/n): ");
      another = scan.nextLine();
      

    }
    
    //this loop iterates through each item in the array list and prints it out, numbered
    System.out.println("Shopping List: \n");
        int i = 0;
        while (i < list.size()){
         System.out.println((i + 1) + ". " + list.get(i));
         i++;
        }
         
    double total = 0;
    int j = 0;
    
    //this loop adds each of the items in the list toegther to get the totsl price
    while (j < list.size()){
        total = total + (list.get(j).getItemPrice()*list.get(j).getItemQuantity());
        j++;
    }
    
    //this prints out the total cost (with correct formatting for price)
    System.out.println("Total cost : " + "$" + String.format("%.2f", total));
   
  

    // Asks user if they want to remove anything from the list
    System.out.println("Do you want to remove an item? (y/n)");
    String removeChoice = scan.nextLine();

    while (removeChoice.equalsIgnoreCase("y")) {

        System.out.println("Enter the number of the item you want to remove: ");
        int remove = scan.nextInt();
        scan.nextLine();

        list.remove(remove - 1);

        // Displays the updated shopping list
        System.out.println("\nUpdated Shopping List:");

        int k = 0;
        while (k < list.size()) {
            System.out.println((k + 1) + ". " + list.get(k));
            k++;
        }

        // Recalculates the total
        total = 0;
        int m = 0;

        while (m < list.size()) {
            total = total + (list.get(m).getItemPrice() * list.get(m).getItemQuantity());
            m++;
        }

        System.out.println("Updated total: $" + String.format("%.2f", total));

        // Asks if user wants to remove another item
        System.out.println("Do you want to remove another item? (y/n)");
        removeChoice = scan.nextLine();
    }

    scan.close();
    }
}

class ShoppingListItem{
    //private variables for item in shopping list
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    
    //constructor for item in shopping list
    public ShoppingListItem(String itemName, double itemPrice, int itemQuantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
    
    //getters and setters for the item's name, price, and quantity
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return itemName;
    }
    
    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }
    
    public double getItemPrice(){
        return itemPrice;
    }
    public void setItemQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }
    
    public int getItemQuantity(){
        return itemQuantity;
    }
    
    //toString method so the shopping list can be displayed
    public String toString(){
        return itemName + " - $" + String.format("%.2f", itemPrice) + " Quantity: " + itemQuantity;
}   
}






