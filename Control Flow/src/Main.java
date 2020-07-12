
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Comparison Operators  
		
		int x = 1;
		int y = 1;
		System.out.println(x == y);
		
		// Logical Operators 
		int temperature = 1;
		boolean isWarm = temperature > 20 && temperature < 30;
		System.out.println(isWarm);
		
		boolean hasHighIncome = false;
		boolean hasGoodCredit = false;
		boolean hasCriminalRecord = false;
		boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;
		
		System.out.println(isEligible);
		
		// To reverse a value 
		
	}

}
