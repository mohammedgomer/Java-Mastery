
// Every class that implements me 
// should have a public method with the same exact signature - calculateTax
public class TaxCalculator2018 implements TaxCalculator {
	private double taxableIncome;
	
	public TaxCalculator2018(double taxableIncome) {
		this.taxableIncome = taxableIncome;
		
	}
	
	// Even though we have no compilation error
	// We should override implementation for interface methods - best practice
	@Override
	public double calculateTax() {
		return taxableIncome * 0.3;
	}

}