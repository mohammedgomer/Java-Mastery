package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
	public static void show() {
		Collection<String> collection = new ArrayList();
		
		// What if we wanted to add all instead of separately?
//		collection.add("a");
//		collection.add("b");
//		collection.add("c");
//		
		Collections.addAll(collection, "a", "b", "c");
		
		// Converting collection into an array 
		//Object[] objectArray = collection.toArray();
		
		// Comparing two collections for equality
		Collection<String> other = new ArrayList();
		other.addAll(collection);
		
		// Two different objects in memory 
		System.out.println(collection == other);
		// True because both collections have the same contents
		System.out.println(collection.equals(other));
	}
}
