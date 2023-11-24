package demo.DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Conn {

	public static String driver ="com.mysql.cj.jdbc.Driver";
	public static String url    ="jdbc:mysql://localhost:3306/sys";
	public static String user   ="root";
	public static String pwd    ="mysql";
	
	
	static Connection con;
	
	public static Connection getConn()
	{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
