package p2024_07_29;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsptest";
		
		Connection con = null;
		
		try {
			Class.forName(driver);	// JDBC Driver Loading
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			System.out.println("데이터베이스 연결 성공~!!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
