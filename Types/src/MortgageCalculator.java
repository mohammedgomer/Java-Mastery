import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {

		// Scanner to get user input
		Scanner sc = new Scanner(System.in);

		int principle = (int) readNumber("Principle: ", 1000, 1000000);

		double interestRate = readNumber("Annual Interest Rate: ", 1, 30);

		int period = (int) readNumber("Period (Years): ", 1, 30);

		double mortgage = calculateMortgage(principle, interestRate, period);

		// Formatting the mortgage value into currency so that it is readable, method
		// chaining instead
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Monthly Payments: " + mortgageFormatted);
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");

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

//	public static double paymentSchedule(int principle, double monthlyInterest, short n, int numberOfPaymentsMade) {
//		return 1.5;
//	}

	public static double calculateMortgage(int principle, double interestRate, int period) {
		// Constants - As months in a year and percentage never change
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		// Calculating the monthly interest rate
		double monthlyInterest = interestRate / PERCENT / MONTHS_IN_YEAR;
		// Calculating number of payment made over months
		short n = (short) (period * MONTHS_IN_YEAR);

		// Mortgage - Displays our monthly payments in currency
		double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, n))
				/ (Math.pow(1 + monthlyInterest, n) - 1);

		// Calculating payment schedule
		int numberOfPaymentsMade = 1;
		double paymentSchedule = principle * (Math.pow(1 + monthlyInterest, n))
				- (Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest, n) - 1);
		
	return mortgage;
	}

}
