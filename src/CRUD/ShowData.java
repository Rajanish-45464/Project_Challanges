package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import demo.DB_Connection.DB_Conn;

public class ShowData {

	public static void showData() throws SQLException
	{
//		StudentDetails sd=new StudentDetails();
//		InsertData.insert(sd);
		Connection con=DB_Conn.getConn();
		String q="select * from student";
		PreparedStatement ps=con.prepareStatement(q);
			
//		ps.setString(1, sd.getName());
//		ps.setInt(2, sd.getId());
//		ps.setString(3, sd.getAddress());	
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{	
			    System.out.println(rs.getString("name")+"  "+rs.getInt("id")+"  "+rs.getString("address"));
		}
		System.out.println();
	}
}
