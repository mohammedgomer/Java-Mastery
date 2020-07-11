
public class TheMathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.round method is overloaded
		// meaning it is implemented twice
		// Math.round rounds floating point numbers into whole numbers
		int result = Math.round(1.1F);
		System.out.println(result);

		// Ceil method returns smallest int
		// greater than or equal to this number
		int result2 = (int) Math.ceil(1.1F);
		System.out.println(result2);

		// Floor of a number is the largest int
		// that is smaller or equal to this number
		int result3 = (int) Math.floor(1.1F);
		System.out.println(result3);

		// Max returns the greater number out of two
		// min does the same for the minimum number
		int result4 = (int) Math.max(1, 2);
		System.out.println(result4);
		
		// Returns a random floating point number from 0 to 1
		double result5 = (int) Math.random();
		System.out.println(result5);

	}

}
