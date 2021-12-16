import java.util.*;
import java.sql.*;
public class A {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:sqlite:mydb.db");
		var sql = "SELECT StudentNo, StudentName FROM Students";

		try(var ps = conn.prepareStatement(sql);
			var rs = ps.executeQuery()) {
				while(rs.next()) {
					Object idField = rs.getObject("studentNo");
					Object nameField = rs.getObject("studentName");
					if(idField instanceof Integer) {
						int id = (Integer) idField;
						System.out.println(id);
					}

					if(nameField instanceof String) {
						String name = (String) nameField;
						System.out.println(name);
					}
				}
			}
	}
}
