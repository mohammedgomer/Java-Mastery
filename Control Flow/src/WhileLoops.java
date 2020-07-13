import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While loops are similar to for loops in terms
		// of functionality but different in terms of syntax

		// For loop implementation is cleaner,
		// when you know how many times you want to execute a statement
		// the for loop is better
		// when you don't know how many times you want to execute
		// a statement, then the while loop is better

		// Going to do this same for loop but in a while loop

		for (int i = 5; i > 0; i--)
			System.out.println("Hello World" + i);

		// Initialising loop variable to 0
		int i = 0;
		// Loop condition in parentheses
		while (i > 0) {
			// While i is more than 0
			// We are going to execute the code in this block
			System.out.println("Hello World " + i);
			i--;
		}

		// program asking a user to implement something
		// asking the user to continuously enter something
		// until the moment they enter "quit".
		// we don't know when the user will enter quit,
		// so a while loop is useful in this instance.

		String input = "";

		// Instantiating Scanner object using System.in
		Scanner sc = new Scanner(System.in);

		while (!input.equals("quit")) {
			System.out.println("Input: ");

			// This will return a string so when store it
			// in the input variable
			input = sc.next().toLowerCase();

			System.out.println(input);
		}
		System.out.println("PROGRAM ENDED.");

	}

}
