
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start");
		printNumbers(4);
		System.out.println("Finish");
	}
	
	public static void printNumbers(int limit) {
		for(int i = 0; i < limit; i+=2) {
			System.out.println(i);
		}
	}

}
 