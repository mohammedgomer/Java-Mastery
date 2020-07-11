import java.text.NumberFormat;

public class FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Can't instantiate abstract methods
		// Factory method because its like a factory,
		// it create new objects
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(1234567.891);
		System.out.println(result);

		// Can do the same for percentages
		// Calling NumberFormat class, making a percentage format instance
		// Storing result in a String variable 
		String result2 = NumberFormat.getPercentInstance().format(0.1); // method chaining
		System.out.println(result2);

	}

}
