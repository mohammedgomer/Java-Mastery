import java.util.Objects;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		// If the current object is equal to the object passed, return true
		if (this == obj)
			return true;
		// Down casting - If the object is not an instance  of Point, return false
		if (!(obj instanceof Point))
			return false;

		// The object/obj we are using is Point 
		
		// Downcast and store the value inother 
		var other = (Point) obj;
		return other.x == x && other.y == y;

	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

}
