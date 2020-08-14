
public class Main {

	public static void main(String[] args) {
		var list = new GenericList<String>();
		list.add("a");
		list.add("b");
		for(var myList : list) {
			System.out.println(myList);
		}
		
		// Now that our list implements the iterator interface
		// We know that it has the iterator method - so we call it 
		// Can now iterate or loop over a list without knowing anything 
		// About its internal implementation  
		//var iterator = list.iterator(); 
		// Asking, do you have more items?
		//while(iterator.hasNext()) {
			//var current = iterator.next(); // Will return current object 
			//System.out.println(current);
		}
		
	}

//}
