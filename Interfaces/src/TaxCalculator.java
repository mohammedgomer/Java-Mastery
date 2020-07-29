
public interface TaxCalculator {
	// Abstract method because we don't have curly braces, 
	// only a method declaration
	
	// public keyword not necessary 
	// as every method should be accessible outside the class for the 
	// interface to access 
	
	// Interface determines public contract of a class 
	 double calculateTax();
}
