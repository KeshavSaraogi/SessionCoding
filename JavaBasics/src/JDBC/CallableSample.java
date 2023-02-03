package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class CallableSample {
	
	public static Connection con = null;
	public static CallableStatement callSt = null;

	public static void main(String[] args) {
		

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoOne", "root", "keshav");
			System.out.println("Database Connected");
			callSt = con.prepareCall("{call insert record(?,?,?)}");
			callSt.setInt(1,6);
			callSt.setString(2, "xy");
			callSt.setString(3, "pwd");
			
			callSt.executeUpdate();
		}
			
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
