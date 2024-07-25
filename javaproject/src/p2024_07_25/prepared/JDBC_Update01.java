package p2024_07_25.prepared;

import java.io.*;
import java.sql.*;

public class JDBC_Update01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;	//데이터베이스 접속
		PreparedStatement pstmt = null; 	//sql문 실행
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("수정할 회원번호 입력:");
			int no = Integer.parseInt(br.readLine());
			
			System.out.println("수정할 이름 입력:");
			String name = br.readLine();
			
			System.out.println("수정할 이메일 입력:");
			String email = br.readLine();
			
			System.out.println("수정할 전화번호 입력");
			String tel = br.readLine();
			
			String sql = "update customer set name=?, email=?, tel=? where no=?";
	
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, tel);
			pstmt.setInt(4, no);
			
			System.out.println("sql문:"+sql);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("회원정보 수정 성공");
			}else {
				System.out.println("회원정보 수정 실패");
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
