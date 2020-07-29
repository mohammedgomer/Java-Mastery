
public class TaxReport {
	// Tightly coupled code, dependent on the TaxCalculator class
	private TaxCalculator calculator;

// Constructor Injection 
	public TaxReport(TaxCalculator calculator) {
		this.calculator = calculator;
	}

	public void show() {
		var tax = calculator.calculateTax();
		System.out.println(tax);
	}

	// Setter Injection
	// Benefit is we can change these dependencies throughout the lifetime 
	// of our program
	public void setCalculator(TaxCalculator calculator) {
		this.calculator = calculator;
	}

}
