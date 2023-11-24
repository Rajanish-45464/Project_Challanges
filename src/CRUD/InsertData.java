package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import demo.StudentDetails;
import demo.DB_Connection.DB_Conn;

public class InsertData {
	
	public static boolean insert(StudentDetails sd) throws SQLException{
		Connection con=DB_Conn.getConn();
		
		String q="insert into student(name,id,address) values(?,?,?)";
		PreparedStatement st=con.prepareStatement(q);
	    
		st.setString(1, sd.getName());
		st.setInt(2, sd.getId());
		st.setString(3, sd.getAddress());
		
		int i=st.executeUpdate();
		if(i>0)
	        return true;	
		else
			return false;
	}
}
