import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		
		// Scanner class to get user input 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		// Using trim method to trim any white space that comes before
		// or after user input - chaining multiple methods
		String name = scanner.nextLine().trim();
		System.out.println("You are " + name);
	}

}
