/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to
change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this
template
*/
package correct.change;
import java.util.Scanner;

public class CorrectChange {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Enter the monetary amount to recieve the correct change:");
double change = scan.nextDouble();


int tens = 0;
int fives = 0;
int ones = 0;
double ncents = 0;
double cents = 0;
int quarters = 0;
int dimes = 0;
int nickels = 0;
int pennies = 0;

tens = (int)change / 10;
fives = (int)change % 10 /5;
ones = (int)change % 10 % 5;
// To isolate the cents in the change, I'm subtracting the interger version of the change from the full value
cents = change - (int)change;
ncents = cents * 100 +.0001;

quarters = (int)ncents / 25;
dimes = (int)ncents % 25 / 10;
nickels = (int)ncents % 25 % 10 / 5;
pennies = (int)ncents % 25 % 10 % 5;
//This section tells the user what the computer has calcuated for each dollar or coin
System.out.println("Tens: " + tens);
System.out.println("Fives: " + fives);
System.out.println("Ones: " + ones);
System.out.println("Quarters: " + quarters);
System.out.println("Dimes: " + dimes);
System.out.println("Nickels: " + nickels);
System.out.println("Nickels: " + nickels);
System.out.println("Pennies: " + pennies);
}


}