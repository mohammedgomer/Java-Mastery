import java.util.Scanner;

public class LoopExercises {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		// Exercise 1
//		for(int i = 1; i<=12;i++) {
//			System.out.println(i + " x 6 = " + i*6);
//		}

		// Exercise 2

//		
//		for(int j = 0; j < 6; j++) {
//			for(int i = 0; i < 3; i ++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		// Exercise 2
//	for(int j=1; j <= 6; j++) {
//		for(int i = 1; i < j; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println(j);
//	}

		// Exercise 3
		// * * *
		// * * *
		// * * * * * * * * *
		// * * * * * * * * *
		// * * *
		// * * *
//		for (int j = 0; j < 6; j++) {
//			if(j==2 || j ==3) {
//				for(int k = 0; k < 9; k++) {
//					System.out.print("* ");
//				}
//			}
//			else {
//			for (int i = 0; i < 3; i++) {
//				System.out.print("* ");
//				
//			}
//			}
//			System.out.println();
//		}

		// NOT SOLVED
//		char[] myChar = {'A', 'B', 'C'};
//		
//		for(int j = 0; j<3; j++) {
//			for(int i = 0; i<myChar.length; i++) {
//				System.out.print(myChar[0]);
//			}
//			System.out.println();
//		}

		// EXERCISE 5

		
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			System.out.println("-------Vending Machine-------");
			System.out.println("[1] Get Gum");
			System.out.println("[2] Get Chocolate");
			System.out.println("[3] Get Popcorn");
			System.out.println("[4] Get Juice");
			System.out.println("[5] Display Total Sold So Far");
			System.out.println("[6] Quit");
			switch (option) {
			case 1:
				System.out.println("Here is your gum");
				continue;
			case 2:
				System.out.println("Here is your chocolate");
				break;
			case 3:
				System.out.println("Here is your popcorn");
				break;
			case 4:
				System.out.println("Here is your juice");
			default:
				System.out.println("Error, options 1-6 only!");

				// case 5: System.out.println();
			}
		}

	}

}
