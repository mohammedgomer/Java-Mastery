import java.lang.reflect.Array;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits = { "Apple", "Mango", "Orange" };

		// WAY 1 - NORMAL FOR LOOP
		for (int i = 0; i < fruits.length; i++)
			System.out.println(fruits[i]);

		// First we declare the type of variable we are going to iterate over
		// In this case all out values are String and we give a name - String fruit

		// Second we write the name of our array - fruits

		// WAY 2 - FOR-EACH
		// For-each limitations, can't iterate from end to beginning
		// Only forward
		// Second limitation, we don't have access to the index of each item
		// Can only iterate over everything
		for (String fruit : fruits)
			System.out.println(fruit);

	}

}
