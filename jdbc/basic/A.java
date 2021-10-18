import java.sql.*;

public class A {
	private void _1() throws SQLException {
		try{
			Connection conn = DriverManager.getConnection("jdbc:sqlite:mydb.db");
			System.out.println(conn);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		A a = new A();
		a._1();
	}
}
