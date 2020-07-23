import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int principle = (int) Console.readNumber("Principle: ", 1000, 1000000);
		double interestRate = Console.readNumber("Annual Interest Rate: ", 1, 30);
		int period = (int) Console.readNumber("Period (Years): ", 1, 30);

		var calculator = new MortgageCalculation(principle, interestRate, period);
		var report = new MortgageReport(calculator);

	
		report.printMortgage();
		report.printPaymentSchedule();

	}

}
