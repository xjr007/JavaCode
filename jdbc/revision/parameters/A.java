import java.sql.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:sqlite"
				+ ":mydb.db");
		
		try {
			Test app = new Test();
			app.createDatabase(con);

			app.runQuery(con);
			
			app.populateDatabase(con, 123459, "Aghmad", "Sectar");
			app.runQuery(con);
		} catch(SQLException e) {
			System.out.println(e.getMessage() + "\n");
		}
	}
}

class Test {

	private static boolean populated;
	public void createDatabase(Connection con) throws SQLException {
		var s  = "CREATE TABLE IF NOT EXISTS Students (" + 
			"id INTEGER AUTO_INCREMENT PRIMARY KEY," +
			"name TEXT NOT NULL," +
			"surname TEXT NOT NULL" +
			")";
		
		System.out.println("Creating database...");
		
		try(var ps = con.prepareStatement(s)) {
			ps.executeUpdate();
			System.out.println("Database created.");
		} catch(SQLException e) {
			throw new SQLException("Could not create database.");
		}
	}

	public void runQuery(Connection con) throws SQLException {
		int i;
		var s = "SELECT * FROM Students";
		Map<Integer, String> students = new HashMap<>();
		
		System.out.println("Reading database...");

		try(var ps = con.prepareStatement(s);
			ResultSet rs = ps.executeQuery() ) {

			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");

				students.put(id, name + " " + surname);
			}
			System.out.println("List of students:");
			
			i = 0;
			for(String fullName: students.values()) {
				System.out.println(++i + ". " + fullName);
			}
		} catch(SQLException e) {
			throw new SQLException("Could not run query.");
		}

	}

	public final void populateDatabase(Connection con, int id, String name, String surname) throws SQLException {
		
		if(populated == true) return;

		var s = "INSERT INTO Students VALUES(?, ?, ?) ";
		
		System.out.println("Populating database...");

		try(var ps = con.prepareStatement(s)) { 
			ps.setInt(1, id);
			ps.setString(3, surname);
			ps.setString(2, name);
			ps.executeUpdate();
			System.out.println("Database populated.");
			
			populated = true;
		} catch(SQLException e) {
			throw new SQLException("Could not populate database.");
		}
	}
}
