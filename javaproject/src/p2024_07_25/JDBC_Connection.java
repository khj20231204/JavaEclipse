package p2024_07_25;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connection {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			System.out.println("데이터베이스 연결 성공!");
			
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		}finally {
			try {
				if(con != null) con.close();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
