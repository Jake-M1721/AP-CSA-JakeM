/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumandwrapper;

import java.util.Scanner;

/**
 *
 * @author jmillard2027
 */
public class EnumAndWrapper {
enum Day {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday};

enum Month {January, February, March, April, May, June, July, August, September, October, November, December}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Day day1, day2, day3, day4, day5, day6, day7;
    
    day1 = Day.Sunday;
    day2 = Day.Monday;
    day3 = Day.Tuesday;
    day4 = Day.Wednesday;
    day5 = Day.Thursday;
    day6 = Day.Friday;
    day7 = Day.Saturday;
    
    System.out.println("Sunday is the " + (day1.ordinal() + 1) +"st" + " day of the week");
    System.out.println("Monday is the " + (day2.ordinal() + 1) +"nd" + " day of the week");
    System.out.println("Tuesday is the " + (day3.ordinal() + 1) +"rd" + " day of the week");
    System.out.println("Wednesday is the " + (day4.ordinal() + 1) +"th" + " day of the week");
    System.out.println("Thursday is the " + (day5.ordinal() + 1) +"th" + " day of the week");
    System.out.println("Friday is the " + (day6.ordinal() + 1) +"th" + " day of the week");
    System.out.println("Saturday is the " + (day7.ordinal() + 1) +"th" + " day of the week");
    
    Month month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12;
    
    month1 = Month.January;
    month2 = Month.February;
    month3 = Month.March;
    month4 = Month.April;
    month5 = Month.May;
    month6 = Month.June;
    month7 = Month.July;
    month8 = Month.August;
    month9 = Month.September;
    month10 = Month.October;
    month11 = Month.November;
    month12 = Month.December;
    
    System.out.println();
    System.out.println("January is the " + (month1.ordinal() + 1) +"st" + " month of the year");
    System.out.println("February is the " + (month2.ordinal() + 1) +"nd" + " month of the year");
    System.out.println("March is the " + (month3.ordinal() + 1) +"rd" + " month of the year");
    System.out.println("April is the " + (month4.ordinal() + 1) +"th" + " month of the year");
    System.out.println("May is the " + (month5.ordinal() + 1) +"th" + " month of the year");
    System.out.println("June is the " + (month6.ordinal() + 1) +"th" + " month of the year");
    System.out.println("July is the " + (month7.ordinal() + 1) +"th" + " month of the year");
    System.out.println("August is the " + (month8.ordinal() + 1) +"rd" + " month of the year");
    System.out.println("September is the " + (month9.ordinal() + 1) +"th" + " month of the year");
    System.out.println("October is the " + (month10.ordinal() + 1) +"th" + " month of the year");
    System.out.println("November is the " + (month11.ordinal() + 1) +"th" + " month of the year");
    System.out.println("December is the " + (month12.ordinal() + 1) +"th" + " month of the year");
    
    
   Scanner scan = new Scanner(System.in);
    System.out.println();
    
    //asks for username
    System.out.println("Enter your CCHS username: ");
    
   //creates a string from the user's input
    String userName;
    userName = scan.next();
    
    //turns the last 4 characters of the string (the graduation year) into a string
  String numName = userName.substring(userName.length() - 4); 
  
  //turns the graduation year into an int
  int gradYear = Integer.parseInt(numName);
  
    System.out.println("Graduation year: " + gradYear);
    System.out.println("The year after your graduation year will be: " + (gradYear + 1));
    
    String binaryYear = Integer.toBinaryString(gradYear);
    System.out.println("In computer language, you graduate in: " + binaryYear);
   
    
    }
    
}
