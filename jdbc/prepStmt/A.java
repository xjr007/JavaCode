import java.sql.*;

public class A {
	private void _1() throws SQLException {
		try{
			Connection conn = DriverManager.getConnection("jdbc:sqlite:mydb.db");
			if(conn != null) System.out.println("Database connection successful.");
			
			try(PreparedStatement ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS Students" + 
						" (studentNo INTEGER NOT NULL, " + 
						" studentName VARCHAR(20) NOT NULL, " +
						" studentSname VARCHAR(20) NOT NULL, " +
						" PRIMARY KEY(studentNo));")){
				System.out.println(ps.execute());
			}

			/*try(PreparedStatement ps = conn.prepareStatement("INSERT INTO Students VALUES(" +
						"346221, 'Mabel', 'Dorey');")){
				System.out.println(ps.executeUpdate());
			}

			
			try(PreparedStatement ps = conn.prepareStatement("UPDATE Students SET studentName = 'Daniel'" +
						"WHERE studentSname = 'Doe'")){
				System.out.println(ps.executeUpdate());			
			}

			try(PreparedStatement ps = conn.prepareStatement("DELETE FROM Students WHERE studentNo = 346220")) {
				System.out.println(ps.executeUpdate());
			}
			*/
			try(PreparedStatement ps = conn.prepareStatement("SELECT * FROM Students")) {
				System.out.println(ps.executeQuery());
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		A a = new A();
		a._1();
	}
}
