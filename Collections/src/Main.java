import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collections.CollectionsDemo;
import collections.Customer;
import collections.EmailComparator;
import collections.ListDemo;

public class Main {

	public static void main(String[] args) {
//		var list = new GenericList<String>();
//		list.add("a");
//		list.add("b");
//		for(var myList : list) {
//			System.out.println(myList);
//		}
//		

		// Now that our list implements the iterator interface
		// We know that it has the iterator method - so we call it
		// Can now iterate or loop over a list without knowing anything
		// About its internal implementation
		// var iterator = list.iterator();
		// Asking, do you have more items?
		// while(iterator.hasNext()) {
		// var current = iterator.next(); // Will return current object
		// System.out.println(current);

//		CollectionsDemo.show();
//		ListDemo.show();
//		
		List<Customer> customers = new ArrayList<>();

		customers.add(new Customer("a", "e3"));
		customers.add(new Customer("b", "e2"));
		customers.add(new Customer("c", "e1"));
		Collections.sort(customers, new EmailComparator());
		System.out.println(customers);

	}

}

//}
