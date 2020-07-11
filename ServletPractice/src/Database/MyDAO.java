package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Dvd;

// Data access object - A class to talk to the database
public class MyDAO {

	// STEP 1
	private Connection getConnection() {

		Connection conn = null;

		try {
			// load driver
			Class.forName("org.sqlite.JDBC");
			// url of the database location
			String url = "jdbc:sqlite:/Users/Gheta/eclipse-workspace/ServletPractice/dvd.sqlite";
			// initialise connection object
			conn = DriverManager.getConnection(url);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// returns conn object
		return conn;
	}

	// instead of returning void we want to return all dvds as objects - because
	// java will understand it and we can work with these objects
	// Returning an array list
	public ArrayList<Dvd> getDVDs() throws SQLException {

		// Declaring the arraylist
		ArrayList<Dvd> allDvds = new ArrayList<>();
		Connection connection = getConnection();
		Statement statement = connection.createStatement();

		String query = "SELECT * FROM collection;";

		System.out.println(query);

		// Code that executes the query - i.e runs in
		ResultSet rs = statement.executeQuery(query);

		// While you got another row keep the while loop going - that's all next does
		while (rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getString("Title");
			String genre = rs.getString("Genre");
			int year = rs.getInt("Year");

			// instead of returning void we want to return all dvds as objects
			// System.out.println(id + " " + title + " " + genre + " " + year);
			Dvd dvd = new Dvd(id, title, genre, year);
			// Adding dvds to the arraylist
			allDvds.add(dvd);

		}
		// Returning the all the dvds from the arraylist that holds the dvd objects
		return allDvds;
	}

	// When we use this method we're going to give you a dvd object
	public void insertDvd(Dvd dvd) throws SQLException {

		Connection connection = getConnection();
		Statement statement = connection.createStatement();

		String query = "INSERT INTO collection (ID, Title, Genre, Year)" + " VALUES (" + dvd.getId() + ", '"
				+ dvd.getTitle() + "', '" + dvd.getGenre() + "', " + dvd.getYear() + ");";

		System.out.println(query);
		statement.executeUpdate(query);

		System.out.println("Done");

		// Code that executes the query - i.e runs in
		// Don't return anything when you're inserting so you don't need the resultset
		// ResultSet rs = statement.executeQuery(query);

		// While you got another row keep the while loop going - that's all next does

	}

	public void updateDvd(Dvd dvd) throws SQLException {

		Connection connection = getConnection();
		Statement statement = connection.createStatement();

		String query = "UPDATE collection " + "SET Title = '" + dvd.getTitle() + "', Genre = '" + dvd.getGenre()
				+ "', Year = '" + dvd.getYear() + "' " + "WHERE ID = 7;";

		System.out.println(query);
		statement.executeUpdate(query);

		System.out.println("Done");

		// Code that executes the query - i.e runs in
		// Don't return anything when you're inserting so you don't need the resultset
		// ResultSet rs = statement.executeQuery(query);

		// While you got another row keep the while loop going - that's all next does

	}

	public void deleteDvd(int id) throws SQLException {

		Connection connection = getConnection();
		Statement statement = connection.createStatement();

		String query = "DELETE FROM collection WHERE ID = " + id + ";";

		System.out.println(query);
		statement.executeUpdate(query);

		System.out.println("Done");

		// Code that executes the query - i.e runs in
		// Don't return anything when you're inserting so you don't need the resultset
		// ResultSet rs = statement.executeQuery(query);

		// While you got another row keep the while loop going - that's all next does

	}

}
