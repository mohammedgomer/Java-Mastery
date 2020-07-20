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
		int[] counter = {0,0,0,0};
		while (true) {

			String[] items = { "Gum", "Chocolate", "Popcorn", "Juice" };
			System.out.println("-------Vending Machine-------");
			System.out.println("[1] Get Gum");
			System.out.println("[2] Get Chocolate");
			System.out.println("[3] Get Popcorn");
			System.out.println("[4] Get Juice");
			System.out.println("[5] Display Total Sold So Far");
			System.out.println("[6] Quit");

			Scanner sc = new Scanner(System.in);
			int option = Integer.parseInt(sc.nextLine());

			if (option == 6) {
				break;
			}


			String word = "";
			switch (option) {

			case 1:
				word = "gum";
				counter[0]+=1;
				break;
			case 2:
				word = "chocolate";
				counter[1]+=1;
				break;
				
			case 3:
				word = "popcorn";	
				counter[2]+=1;
				break;
			case 4:
				word = "juice";
				counter[3]+=1;
				break;

			case 5:
				for (int i = 0; i < items.length; i++) {
					System.out.println(counter[i] + " items of " + items[i] + " sold");
				}
				break;

			default:
				System.out.println("Error, options 1-6 only!");
			}
			
			System.out.println("Here is your " + word);
			

		}

	
	}

}
