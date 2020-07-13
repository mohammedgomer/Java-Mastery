
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Comparison Operators
		int x = 1;
		int y = 1;
		System.out.println(x == y);

		// Logical Operators
		int temperature = 1;
		boolean isWarm = temperature > 20 && temperature < 30;
		System.out.println(isWarm);

		boolean hasHighIncome = false;
		boolean hasGoodCredit = false;
		boolean hasCriminalRecord = false;

		// To reverse a value - !
		boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;

		System.out.println(isEligible);

		// If Statements
		int temp2 = 3;

		if (temp2 > 30) {
			System.out.println("It's a hot day");
			System.out.println("Drink water");
		} else if (temp2 > 20)
			System.out.println("Beautiful day");
		else
			System.out.println("Cold day");

		// Simplifying If Statements
		int income = 120_000;
		boolean hasHighIncome2 = (income > 100_000);
		System.out.println(hasHighIncome2);

		// Ternary Operator -
		// We want to set className to a different string dependent
		// on result of the expression
		// If the income is more than 100_000 - Return First
		// Otherwise if income is not more than 100_000 - Return False
		int income2 = 10_000;
		String className = income2 > 100_000 ? "First" : "False";
		System.out.println(className);

		// Switch Statements
		String role = "admin";
		// Declare switch statement with variable in parentheses
		switch (role) {
		case "admin":
			System.out.println("You're an admin");
			break; // Break statement stops java from executing below lines
		case "moderator":
			System.out.println("You're a moderator");
		default:
			System.out.println("You're a guest");

		}

		// If statement version of switch
		if (role == "admin")
			System.out.println("You're an admin");
		else if (role == "moderator")
			System.out.println("You're a moderator");
		else
			System.out.println("You're a guest");

	}
}
