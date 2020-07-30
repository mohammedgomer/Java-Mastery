
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var calculator = new TaxCalculator2018(100_000);
		var report = new TaxReport();
		System.out.println(calculator.calculateTax());
		//report.setCalculator(new TaxCalculator2019());
		// Method injection - Pass a dependency to a method that needs
		// that dependency 
		report.show(new TaxCalculator2019());
	}
}
