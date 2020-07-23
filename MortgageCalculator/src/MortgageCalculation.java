
public class MortgageCalculation {

	// This class is purely responsible for calculation - No presentation -
	// Seperated concerns

	// Constants - As months in a year and percentage never change
	private final static byte PERCENT = 100;
	private final static byte MONTHS_IN_YEAR = 12;
	// Class is going to have state and behaviour - Encapsulation
	private int principle;
	private double interestRate;
	private int period;

	public MortgageCalculation(int principle, double interestRate, int period) {
		this.principle = principle;
		this.interestRate = interestRate;
		this.period = period;
	}

	public double calculateBalance(short numberOfPaymentsMade) {
		// Calculating payment schedule
		// Calculating the monthly interest rate
		double monthlyInterest = getMonthlyInterest();
		// Calculating number of payment made over months
		short n = getNumberOfPayments();

		double balance = principle
				* (Math.pow(1 + monthlyInterest, n) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
				/ (Math.pow(1 + monthlyInterest, n) - 1);

		return balance;
	}

	public double calculateMortgage() {

		// Calculating the monthly interest rate
		double monthlyInterest = getMonthlyInterest();
		// Calculating number of payment made over months
		short n = getNumberOfPayments();

		// Mortgage - Displays our monthly payments in currency
		double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, n))
				/ (Math.pow(1 + monthlyInterest, n) - 1);

		return mortgage;
	}

	// Want to return a double array as we want to return a list of numbers
	public double[] getRemainingBalances() {
		// Storing balance after each month in our array
		var balances = new double[getNumberOfPayments()];
		for (short month = 1; month <= balances.length; month++) {
			balances[month - 1] = calculateBalance(month);
		}
		return balances;
	}

	private double getMonthlyInterest() {
		return interestRate / PERCENT / MONTHS_IN_YEAR;
	}

	private short getNumberOfPayments() {
		return (short) (period * MONTHS_IN_YEAR);
	}

}
