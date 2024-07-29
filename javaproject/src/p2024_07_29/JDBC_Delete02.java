package p2024_07_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Delete02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsptest";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("삭제할 회원번호를 입력 하세요?");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "delete from customer where no=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();// delete SQL문 실행
			
			if(result == 1) {
				System.out.println("회원정보 삭제 성공");
			}else {
				System.out.println("회원정보 삭제 실패");
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
