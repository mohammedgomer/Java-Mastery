package generics;

public class User implements Comparable<User> {
	private int points;
	
	public User(int points) {
		this.points = points;
	}

	@Override
	public int compareTo(User other) {
		// If current user object is < User o, then return a negative value 
		// If this == o, return 0
		// If this > o, return 1
		
		// If this user has more points than the o user, the result is going
		// to be positive number 
		// If they're equal it's going to be 0 
		// If user has fewer points, result is going to be negative
		return points - other.points;
	}


}
