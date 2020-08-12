package generics;

public class Main {

	public static void main(String[] args) {
		
		// Getting hashcode returned, as we are passing object to println
		// - toString method gets called, default implementation of toString()
		// Need to Override implementation to solve this
		var max = Utils.max(new User(10), new User(20));
		System.out.println(max);
		
		
		Utils.print(1, "Mosh");
		
		User user = new Instructor(10);
		
		
		var instructors = new GenericList<Instructor>();
		var users = new GenericList<Instructor>();
		Utils.printUsers(users);
		//var list = new GenericList<Integer>();
		//list.add(1);
		// We don't need an explicit cast
		// Code becomes cleaner
		// We get compile time type safety, catch errors at compile time
		// Rather than run time
		//int number = list.get(0);

		//GenericList<Integer> numbers = new GenericList<Integer>();
		// Creates an instance of an integer class to store this value
		//numbers.add(1); // Boxing - putting primitive value inside a box
		// Store in primitive int
		//int myNumber = numbers.get(0); // Unboxing - Going to extract value stored
		// in that integer object

		// We can pass short, because short values are comparable
		// Can pass String, int, but not User class, as it does not implement comparable
		// interface
		//new GenericList<User>();
		
//		var user = new User(10);
//		var user1 = new User(20);
		//System.out.println(user.compareTo(user1));
		
	}

}
