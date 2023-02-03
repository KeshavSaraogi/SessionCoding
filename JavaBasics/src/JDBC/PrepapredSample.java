package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepapredSample {

	public static Connection con = null;
	public static PreparedStatement prepSt = null;
	public static String query  = "INSERT INTO Login values of(?,?,?)";
	
	public static void main(String[] args) {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoOne", "root", "keshav");
			System.out.println("Database Connected");
			prepSt = con.prepareStatement(query);
			
			for (int i = 0; i < 3; i++) {
				prepSt.setInt(1, i + 3);
				prepSt.setString(2, "ab");
				prepSt.setString(2, "welcome");
				prepSt.executeUpdate();
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
