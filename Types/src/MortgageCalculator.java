import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	// Constants - As months in a year and percentage never change
	final static byte MONTHS_IN_YEAR = 12;
	final static byte PERCENT = 100;

	public static void main(String[] args) {

		// Scanner to get user input
		Scanner sc = new Scanner(System.in);

		int principle = (int) readNumber("Principle: ", 1000, 1000000);

		double interestRate = readNumber("Annual Interest Rate: ", 1, 30);

		int period = (int) readNumber("Period (Years): ", 1, 30);

		printMortgage(principle, interestRate, period);
		printPaymentSchedule(principle, interestRate, period);

	}

	private static void printMortgage(int principle, double interestRate, int period) {
		double mortgage = calculateMortgage(principle, interestRate, period);

		// Formatting the mortgage value into currency so that it is readable, method
		// chaining instead
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Monthly Payments: " + mortgageFormatted);
	}

	private static void printPaymentSchedule(int principle, double interestRate, int period) {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");

		for (short month = 1; month <= period * MONTHS_IN_YEAR; month++) {
			double balance = calculateBalance(principle, interestRate, period, month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

	public static double readNumber(String prompt, double min, double max) {
		Scanner sc = new Scanner(System.in);
		double value;
		while (true) {
			System.out.println(prompt);
			value = sc.nextDouble();
			if (value >= min && value <= max)
				break;
			System.out.println("Enter a number between " + min + " and " + max);
		}

		return value;
	}

//	double monthlyInterest = 0;

	public static double calculateBalance(int principle, double interestRate, int period, short numberOfPaymentsMade) {
		// Calculating payment schedule
		// Calculating the monthly interest rate
		double monthlyInterest = interestRate / PERCENT / MONTHS_IN_YEAR;
		// Calculating number of payment made over months
		short n = (short) (period * MONTHS_IN_YEAR);

		double balance = principle
				* (Math.pow(1 + monthlyInterest, n) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
				/ (Math.pow(1 + monthlyInterest, n) - 1);

		return balance;
	}

	public static double calculateMortgage(int principle, double interestRate, int period) {

		// Calculating the monthly interest rate
		double monthlyInterest = interestRate / PERCENT / MONTHS_IN_YEAR;
		// Calculating number of payment made over months
		short n = (short) (period * MONTHS_IN_YEAR);

		// Mortgage - Displays our monthly payments in currency
		double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, n))
				/ (Math.pow(1 + monthlyInterest, n) - 1);

		return mortgage;
	}

}
