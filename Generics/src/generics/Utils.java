package generics;

public class Utils {

	// We want to make this method generic
	// Instead of getting two integers and returning an integer
	// We want to be able to work with different types of objects
	public static <T extends Comparable<T>> T max(T first, T second) {
		// If first is greater than second - Return first
		// Otherwise - Return second
		return (first.compareTo(second) < 0) ? second : first;
	}

	// Multiple Type Parameters
	public static <K, V> void print(K key, V value) {
		System.out.println(key + "=" + value);
	}

	public static void printUser(User user) {
		System.out.println(user);
	}

	// Printing list of user
	// Question mark represent unknown type
	// under the hood, class CAP1 gets created - returns instance of capture class
	// CAPTURE class will extend User class, restricting from calling random
	// unnecessary types - can only past User or subtypes of user
	public static void printUsers(GenericList<? extends User> users) {
		User x = users.get(0);
	}

}
