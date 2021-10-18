import java.sql.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql:mydb.db");
		
		String sql = "SELECT studentNo, name FROM Students;";
		Map<Integer, String> mapStudents = new HashMap<>();

		try(
			var ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		) {
			while(rs.next()) {
				int studentNo = rs.getInt("stuidentNo");
				String name = rs.getString("name");
				mapStudents.put(studentNo, name);
			}

			System.out.println(mapStudents);
		}

	}
}
