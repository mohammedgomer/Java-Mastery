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

//		System.out.println("Principle £1K to £1M: ");
//		int principle = sc.nextInt(); 
//		while((principle<1000) || (principle > 1_000_000)) {
//			System.out.println("Enter a value between £1K to £1M");
//			continue;
//		}

		int principle;
		while (true) {
			System.out.println("Principle £1K to £1M: ");
			principle = sc.nextInt();
			if ((principle < 1000) || (principle > 1_000_000)) {
				System.out.println("Enter a number between 1,000 and 1,000,000.");
				continue;
			} else {
				break;
			}
		}

		// Annual Interest Rate
		double interestRate;
		while (true) {
			System.out.print("Annual Interest Rate: ");
			interestRate = sc.nextDouble();
			if ((interestRate) <= 0 || (interestRate > 30)) {
				System.out.println("Enter a value greater than 0 and less than or equal to 30.");
				continue;
			} else {
				break;
			}
		}

		// Period (Years) - Loan for 30 years
		int period;
		while (true) {
			System.out.print("Period (Years): ");
			period = sc.nextInt();
			if ((period <= 0) || period > 30) {
				System.out.println("Enter a value between 1 and 30.");
				continue;
			} else {
				break;
			}
		}

		// Formatting the mortgage value into currency so that it is readable, method
		// chaining instead
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

		// Printing mortgage value
		System.out.println("Mortgage: " + mortgageFormatted);

	}

	public static double calculateMortgage(int principle, double interestRate, int period) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		// Calculating the monthly interest rate
		double monthlyInterest = interestRate / PERCENT / MONTHS_IN_YEAR;
		// Calculating number of payment made over months
		double n = period * MONTHS_IN_YEAR;

		// Mortgage - Displays our monthly payments in currency
		double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, n))
				/ (Math.pow(1 + monthlyInterest, n) - 1);

		// Formatting the mortgage value into currency so that it is readable, method
		// chaining instead
		String mortgageFormatted = (double)NumberFormat.getCurrencyInstance().format(mortgage);

		

		return mortgageFormatted;
	}

}
