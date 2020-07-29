
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var calculator = new TaxCalculator2018(100_000);
		var report = new TaxReport(calculator);
		System.out.println(calculator.calculateTax());
		report.show();
		report.setCalculator(new TaxCalculator2019());
		report.show();
	}
}
