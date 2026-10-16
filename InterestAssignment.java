package interestasignment;

import java.text.NumberFormat;
import java.util.Scanner;

public class InterestAssignment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Ask the user for the loan amount.
        System.out.print("Input an amount in dollars: ");
        double inputMoney = scan.nextDouble();

        // Ask the user for the repayment period.
        System.out.print("Input a number of months for repayment: ");
        int months = scan.nextInt();


        // Create the calculator object.
        InterestRateCalculator calc = new InterestRateCalculator(months);

        // Calculate the monthly payment.
        double monthlyPayment = calc.calculateMonthlyPayment(inputMoney);

        // Calculate the total amount repaid.
        double totalRepaid = calc.calculateTotalRepaid();

        // Format the results.
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        NumberFormat percent = NumberFormat.getPercentInstance();

        // Display the results.
        System.out.println("Interest rate: "+ percent.format(InterestRateCalculator.RATE));

        System.out.println("Monthly payment: " + currency.format(monthlyPayment));

        System.out.println("Total amount repaid: " + currency.format(totalRepaid));

        scan.close();
    }
}

class InterestRateCalculator {

    // Public constant interest rate: 5%.
    public static final double RATE = 0.05;

    // Private instance variables.
    private int months;
    private double calcMoney;

    // Constructor.
    public InterestRateCalculator(int inMonths) {
        months = inMonths;
        calcMoney = 0.0;
    }

    // Calculate and return the monthly payment.
    public double calculateMonthlyPayment(double amount) {
        double monthlyPrincipal = amount / months;

        calcMoney = monthlyPrincipal * (1 + RATE);

        return calcMoney;
    }

    // Calculate and return the total repayment.
    public double calculateTotalRepaid() {
        return calcMoney * months;
    }
}



