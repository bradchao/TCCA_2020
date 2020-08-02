package tw.brad.tcca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

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
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:8889/tcca?user=root&password=root&serverTimezone=Asia/Taipei");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:8889/tcca?serverTimezone=Asia/Taipei",
//					"root","root");
			
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/tcca",prop);
//			Statement stmt = conn.createStatement();
//			stmt.execute("insert into cust (cname, tel, birthday) values ('tony','321','1999-09-02')");
			
//			PreparedStatement pstmt = conn.prepareStatement(
//					"insert into cust (cname, tel, birthday) values (?,?,?)");
//			pstmt.setString(1, "公會v2");
//			pstmt.setString(2, "04-12345678");
//			pstmt.setString(3, "1999-01-02");
//			pstmt.executeUpdate();

//			PreparedStatement pstmt = conn.prepareStatement(
//					"delete from cust where id = ?");
//			pstmt.setInt(1, 3);;
//			pstmt.executeUpdate();

			PreparedStatement pstmt = conn.prepareStatement(
					"update cust set cname=?, tel=? where id = ?");
			pstmt.setString(1, "AMY");
			pstmt.setString(2, "1234");
			pstmt.setInt(3, 2);
			pstmt.executeUpdate();

			
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
	}

}
