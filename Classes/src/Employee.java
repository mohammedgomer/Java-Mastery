
public class Employee {
	// Public means this field is accessible outside this class
	// Private means it is not accessible outside the employee class
	private int baseSalary;
	private int hourlyRate;

// Passed in extraHours through parameter instead as it is not fixed 
	public int calculateWage(int extraHours) {
		return baseSalary + (hourlyRate * extraHours);
	}
	
	// With this method we are preventing an employee object from going to an invalid state 
	public void setBaseSalary(int baseSalary) {
		if(baseSalary <=0) 
			// Causes program to terminate 
			throw new IllegalArgumentException("Salary cannot be 0 or less.");
			this.baseSalary = baseSalary;		
	}
	
	// How can we read the baseSalary value and print it to the console?
	// getBaseSalary method 
	
	// Hiding the implementation detail - Abstraction - Less coupling
	private int getBaseSalary() {
		return baseSalary;
	}
	
	public void setHourlyRate(int hourlyRate) {
		if(hourlyRate <= 0) 
			throw new IllegalArgumentException("Hourly Rate cannot be less than or equal to 0");
			this.hourlyRate = hourlyRate;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}
	
}
