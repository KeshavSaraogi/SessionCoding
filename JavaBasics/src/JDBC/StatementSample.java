package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementSample {
	
	
	public static Connection con = null;
	public static Statement st = null;
	public static ResultSet rs = null;

	public static void main(String[] args) {

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoOne", "root", "keshav");
			System.out.println("Database Connected");
			st = con.createStatement();
			
			//String sql = "INSERT INTO Login values of()";
			//int result = st.executeUpdate(sql);
			//System.out.println(result);
			
			String sql = "SELECT * FROM LOGIN";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("id") + " " + rs.getString("uname") + " " + rs.getString("pwd")); 
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
