import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. We start with the do keyword and create a code block
		// 2 End of code block we type while and our condition
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		
		do {
		System.out.println("Input: ");
		input = sc.nextLine().toLowerCase();
		System.out.println(input);
		} while(!input.equals("quit"));
	}

}
