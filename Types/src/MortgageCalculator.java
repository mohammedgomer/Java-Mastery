import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {

		// Constants - As months in a year and percentage never change
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;

		// Scanner to get user input
		Scanner sc = new Scanner(System.in);

		// Principle - Amount of loan we want to get
		System.out.print("Principle: ");
		int principle = sc.nextInt();

		// Annual Interest Rate
		System.out.print("Annual Interest Rate: ");
		double interestRate = sc.nextDouble();

		// Period (Years) - Loan for 30 years
		System.out.print("Period (Years): ");
		int period = sc.nextInt();

		// Calculating the monthly interest rate
		double monthlyInterest = interestRate / PERCENT / MONTHS_IN_YEAR;

		// Calculating number of payment made over months
		double n = period * MONTHS_IN_YEAR;

		// Mortgage - Displays our monthly payments in currency
		double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, n))
				/ (Math.pow(1 + monthlyInterest, n) - 1);

		// Formatting the mortgage value into currency so that it is readable, method
		// chaining instead
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

		// Printing mortgage value
		System.out.println("Mortgage: " + mortgageFormatted);

	}

}
