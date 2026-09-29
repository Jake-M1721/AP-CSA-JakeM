/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathassignment;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author jmillard2027
 */
public class MathAssignment {
    
    
    
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
        }
    
    public static void main(String[] args) {
      Random generator = new Random(); 
      int angle;
      double sAngle, cAngle, tAngle; 
      angle = generator.nextInt(91); 
      sAngle = Math.sin(angle);
      cAngle = Math.cos(angle); 
      tAngle = Math.tan(angle); 
      
                 
      double radius, area, volume; 
      radius = generator.nextDouble(20.0);
      area = Math.PI * Math.pow(radius, 2);  
      volume = (4.0 / 3.0) + Math.PI * Math.pow(radius, 3); 
      
      System.out.println("Number: " + angle+ "," + " Sine: " + roundAvoid(sAngle,3) + "," + " Cosine " + roundAvoid(cAngle,3) + "," + " Tangent " + roundAvoid(tAngle,3));
      System.out.println("The area of a circle with a radius " + roundAvoid(radius, 3) + " equals " + roundAvoid(area,3));
      System.out.println("The volume of a sphere with a radius " + roundAvoid(radius,3) + " equals " + roundAvoid(volume, 3));
      
      
      double largeNumber = 100000000.0
                + generator.nextDouble() * (100000000000.0 - 100000000.0);

        double squareRoot = Math.sqrt(largeNumber);
        double naturalLog = Math.log(largeNumber);
        double log10 = Math.log10(largeNumber);

        System.out.println();
        System.out.println("Large random number: "
                + roundAvoid(largeNumber, 5));

        System.out.println("Square root: "
                + roundAvoid(squareRoot, 5));

        System.out.println("Natural logarithm: "
                + roundAvoid(naturalLog, 5));

        System.out.println("Log10: "
                + roundAvoid(log10, 5));

    

        double speedOfLight = 299792458.0; 

        
        double massKg = largeNumber / Math.pow(speedOfLight, 2);

        
        double massGrams = massKg * 1000.0;

        System.out.println();
        System.out.print("Enter the number of decimal places for the mass: ");
        
        Scanner input = new Scanner(System.in);
        int massPlaces = input.nextInt();

        System.out.println(
                "Mass required: " + roundAvoid(massGrams, massPlaces)+ " grams"
        );

       

        System.out.println("Enter a real number: ");
        
        double userNumber = input.nextDouble();

        System.out.print("Enter an integer exponent: ");
        int exponent = input.nextInt();

        System.out.print("Enter the number of decimal places: ");
        int powerPlaces = input.nextInt();

        double powerResult = Math.pow(userNumber, exponent);

        System.out.println(userNumber+ " to the power of "+ exponent + " equals "+ roundAvoid(powerResult, powerPlaces) );

        input.close();
      
      
      
      
      
      
     
      
      
        
    }
    
}
