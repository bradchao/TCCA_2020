package tw.brad.tcca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLTest1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("Class Not Found");
		}
		
		try {
			// jdbc:sqlserver://<server>:<port>;databaseName=AdventureWorks;user=<user>;password=<password>
			// jdbc:mysql://localhost:3306/GUESTBOOK?user=caterpillar&password=123456
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/tcca?user=root&password=root");
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
	}

}
