import java.util.Scanner;

public class FizzBuzzExercise {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number: ");
	int number = sc.nextInt();
	
	// If number is divisible by both 5 & 3 return FizzBuzz
    if(number%5==0 && number % 3==0) 
		System.out.println("FizzBuzz");
	
	// If number is divisible by 5 return Fizz 
    else if(number%5==0)
		System.out.println("Fizz");
	
	// If number divisible by 3 return Buzz
	else if(number%3==0)
		System.out.println("Buzz");
	
	// If number is not divisible by 5 or 3 return the number
	else 
		System.out.println(number);
}
}