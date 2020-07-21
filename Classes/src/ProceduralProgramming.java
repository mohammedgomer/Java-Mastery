
public class ProceduralProgramming {

	public static void main(String[] args) {
		// Program to calculate wage of employees
		
		// Procedural programming
//		int baseSalary = 50_000;
//		int extraHours = 10;
//		int hourlyRate = 20;
//		
//		int wage = calculateWage(baseSalary, extraHours, hourlyRate);
//		System.out.println(wage);
		
		// OOP Programming - Much more efficient
		// Fewer lines of code
		// Easier to maintain
		var employee = new Employee();
		employee.setBaseSalary(50_000);
		
		// What if we wanted to do validation on the salary?
		// Could use an if statement, but it's tedious as we 
		// Have to do it every time - Use getters & setters
		employee.setHourlyRate(20);
	
	
		int wage = employee.calculateWage(10);
		System.out.println(wage);
	}

	// Procedural programming
	// With procedural programming you will end up 
	// With a lot of parameters
//	public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
//		return baseSalary + (extraHours * hourlyRate);
//	}
	

}
