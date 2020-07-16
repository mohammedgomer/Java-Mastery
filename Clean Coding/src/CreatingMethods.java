
public class CreatingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// greet 
		String message = greetUser("Mohammed", "Omer");
		System.out.println(message);
	}
	// Public means this method can be called from outside of this class
	public static String greetUser(String firstName, String lastName) {
		return "Hello " + firstName + " " + lastName;
	}

}
