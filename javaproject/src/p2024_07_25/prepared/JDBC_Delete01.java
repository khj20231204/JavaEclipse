package p2024_07_25.prepared;

import java.io.*;
import java.sql.*;

public class JDBC_Delete01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;	//데이터베이스 접속
		PreparedStatement pstmt = null; 	//sql문 실행
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("삭제할 회원번호 입력:");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "delete customer where no= ?";
					
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("회원삭제 성공");
			}else {
				System.out.println("회원삭제 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(con != null)		con.close();
			}catch(Exception e) {
				
			}
		}
	}

}
