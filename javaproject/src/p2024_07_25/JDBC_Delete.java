package p2024_07_25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;	//데이터베이스 접속
		Statement stmt = null; 	//sql문 실행
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			stmt = con.createStatement();
			
			System.out.println("회원번호 입력:");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "delete customer where no=" + no;
			
			System.out.println("출력sql:"+sql);
					
			int result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)stmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				
			}
		}
	}

}
