import java.util.*;
import java.sql.*;

public class Hours {

	public int getOpening(Connection conn, String day) throws SQLException {
		String sql = "SELECT opens FROM hours WHERE day = ?";
		
		try(var ps = conn.prepareStatement(sql)) {
			ps.setString(1, day);

			try(var rs = ps.executeQuery()) {
				if(rs.next()) return rs.getInt("opens");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return -1;
	}
}
