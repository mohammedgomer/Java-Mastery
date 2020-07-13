import java.util.Scanner;

public class BreakAndContinue {
	public static void main(String[] args) {

		// Solving problem of word "quit" getting echoed back
		String input = "";

		Scanner sc = new Scanner(System.in);

		// Can use "true" in the condition instead of an actual condition
		// Although must always have a break statement or it will be an endless loop
		// Essentially the loop will always be true, until someone input "quit"

		while (true) {
			System.out.print("Input: ");

			// This will return a string so when store it
			// in the input variable
			input = sc.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			if (input.equals("quit"))
				// When java sees the break statement
				// it will ignore everything else after and terminate the loop
				break;
			System.out.println(input);

		}
	}
}