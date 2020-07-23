import java.text.NumberFormat;

public class MortgageReport {

	private final NumberFormat currency;
	private MortgageCalculation calculator;

	public MortgageReport(MortgageCalculation calculator) {
		this.calculator = calculator;
		currency = NumberFormat.getCurrencyInstance();

	}

	public void printPaymentSchedule() {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for (double balance : calculator.getRemainingBalances()) {
			System.out.println(currency.format(balance));
		}
	}

	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();

		// Formatting the mortgage value into currency so that it is readable, method
		// chaining instead
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		String mortgageFormatted = currency.format(mortgage);
		System.out.println("Monthly Payments: " + mortgageFormatted);

	}
}
