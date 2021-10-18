import java.sql.*;

public class A {
	private void _1() throws SQLException {
		register(connectToDatabase(), 432550, "Damian", "Daniels");
	}

	private void register(Connection conn, int studentNo, String name,
			String sName) throws SQLException {
		var sql = "INSERT INTO Students VALUES(?, ?, ?);";
		System.out.print("Registering student... ");
		
		try(PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, studentNo);
			ps.setString(2, name);
			ps.setString(3, sName);
			ps.executeUpdate();
			System.out.println("Successful.");

		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Unsuccessful");
		}
		
	}

	private Connection connectToDatabase() throws SQLException {
		System.out.print("Connecting to database... ");
		
		Connection conn = DriverManager.getConnection(
				"jdbc:sqlite:mydb.db");

		if(conn != null) {
			System.out.println("Connection successful.");
			return conn;
		} else {
			System.out.println("Cannot establish connection.");
			return null;
		}

	}

	public static void main(String[] args) throws Exception {
		A a = new A();
		a._1();
	}
}
