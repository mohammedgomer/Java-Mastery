package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void show() {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "a", "b", "c");
		list.remove(0);
		
		// If i wanted to make an exclamation mark the first element
		// Using indexing
		// Can't do this with collections
		//list.add(0, "!");
		System.out.println(list);
		
	}
}
