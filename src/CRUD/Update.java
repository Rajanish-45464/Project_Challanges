package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import demo.StudentDetails;
import demo.DB_Connection.DB_Conn;

public class Update {

	public static boolean update(StudentDetails sd) throws SQLException
	{
		Connection con=DB_Conn.getConn();
		String q="update student set name=?,address=? where id=?";
		PreparedStatement ps=con.prepareStatement(q);
		
		ps.setString(1, sd.getName());
		ps.setString(2, sd.getAddress());
		ps.setInt(3, sd.getId());
		
		int i=ps.executeUpdate();
		if(i>0)
			return true;
		else
			return false;
	}
}
