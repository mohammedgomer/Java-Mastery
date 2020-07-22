import java.util.Scanner;

public class Console {
	// Only used internally inside this Console class
	// So going to set to private
	private static Scanner sc = new Scanner(System.in);

	public static double readNumber(String prompt) {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}

	public static double readNumber(String prompt, double min, double max) {
		double value;
		while (true) {
			System.out.println(prompt);
			value = sc.nextDouble();
			if (value >= min && value <= max)
				break;
			System.out.println("Enter a number between " + min + " and " + max);
		}

		return value;
	}

}
