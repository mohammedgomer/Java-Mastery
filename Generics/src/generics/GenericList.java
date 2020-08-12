package generics;

// T means type or template - common convention 
// T represents type of objects we want to store in this list
// Now we are saying that this list can only store objects that are comparable & cloneable
// With this constraint we have a bounded type parameter, T is bounded, it's restricted  
public class GenericList<T extends Comparable> {
	private T[] items = (T[]) new Object[10];
	private int count;
	
	public void add(T item) {
		items[count++] = item;
	}
	
	public T get(int index) {
		return items[index];
	}

}
