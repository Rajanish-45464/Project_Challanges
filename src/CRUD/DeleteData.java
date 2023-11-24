package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import demo.StudentDetails;
import demo.DB_Connection.DB_Conn;

public class DeleteData {
	public static boolean delete(StudentDetails sd) throws SQLException {

		Connection con = DB_Conn.getConn();
		String query = "delete from student where id=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, sd.getId());
		
		int i=ps.executeUpdate();
		if(i>0)
			return true;
		else
			return false;
	}
}
