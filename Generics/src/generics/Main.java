package generics;

public class Main {

	public static void main(String[] args) {
		var list = new GenericList<Integer>();
		list.add(1);
		// We don't need an explicit cast
		// Code becomes cleaner
		// We get compile time type safety, catch errors at compile time
		// Rather than run time
		int number = list.get(0);

		GenericList<Integer> numbers = new GenericList<Integer>();
		// Creates an instance of an integer class to store this value
		numbers.add(1); // Boxing - putting primitive value inside a box
		// Store in primitive int
		int myNumber = numbers.get(0); // Unboxing - Going to extract value stored
		// in that integer object
	}

}
