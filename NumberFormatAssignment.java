/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberformatassignment;

import java.text.NumberFormat; 
import java.util.Scanner; 
import java.util.Locale; 
import java.util.Random;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 *
 * @author jmillard2027
 */
public class NumberFormatAssignment {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalStudents, numB, numG, DnumG, DnumB; 
        
        Scanner scan = new Scanner(System.in); 
       
        //User inputs number of students and number of girls and number of boys is calculated from that
        System.out.println("Enter total number of students at the school "); 
        totalStudents = scan.nextInt(); 
        System.out.println("Enter the number of girls at the school "); 
        numG = scan.nextInt();      
        numB = totalStudents - numG; 
        
        //this calcuates the percent of boys and girls as a decimal
        DnumG = numG/totalStudents; 
        DnumB = numB/totalStudents; 
        
        
        NumberFormat fmt1 = NumberFormat.getPercentInstance(); 
        
        //prints out percents of boys and girls formatted as a percent
        System.out.println("Percent of girls " + fmt1.format(DnumG));
        System.out.println("Percent of boys " + fmt1.format(DnumB));
        
        
       double dMoneyInput, bMoneyOutput;
        System.out.println("Enter an amount of money in dollars and cents to receive an output in British pounds");
        System.out.println("The exchange rate is currently .75 pence to 1 dollar");
        dMoneyInput = scan.nextDouble();
        
        
        Locale ukLocale = Locale.UK; 
        NumberFormat fmt2 = NumberFormat.getCurrencyInstance(ukLocale);
        fmt2.setMinimumFractionDigits(2);
        
        //convert dollars to pounds
        bMoneyOutput = dMoneyInput * .75; 
        
        //Print out amount of pounds with pound sign in front
        System.out.println("Amount in pounds " + fmt2.format(bMoneyOutput));
        
        
        //Asks user to input the amount of digits of pi they want
        int piDigits; 
        System.out.println("Enter a number between 1 and 15 to get pi to that many digits: ");
        NumberFormat fmt3 = NumberFormat.getInstance();
        piDigits = scan.nextInt();
        
        //sets digits of pi to inputed number
        fmt3.setMinimumFractionDigits(piDigits);
        System.out.println("Pi = " + fmt3.format(Math.PI));
        
        
        BigInteger min = new BigInteger("100000000");
        BigInteger max = new BigDecimal("999e18").toBigInteger();

        // Compute range interval: (max - min) + 1
        BigInteger range = max.subtract(min).add(BigInteger.ONE);
        Random rand = new Random();
        BigInteger randomBigInt;

        // Rejection sampling guarantees standard uniform random distribution in range
        do {
            randomBigInt = new BigInteger(range.bitLength(), rand);
        } while (randomBigInt.compareTo(range) >= 0);

        BigInteger result = min.add(randomBigInt);

        // Convert to BigDecimal and format as plain decimal without scientific notation
        BigDecimal plainOutput = new BigDecimal(result);

        System.out.println("Generated Random Decimal Number:");
        System.out.println(plainOutput.toPlainString());

        scan.close();
    }
    
}
