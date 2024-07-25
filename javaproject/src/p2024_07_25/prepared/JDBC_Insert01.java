package p2024_07_25.prepared;

import java.io.*;
import java.sql.*;

public class JDBC_Insert01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;	//데이터베이스 접속
		PreparedStatement pstmt = null; 	//sql문 실행
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("회원번호 입력:");
			int no = Integer.parseInt(br.readLine());
			
			System.out.println("이름 입력:");
			String name = br.readLine();
			
			System.out.println("이메일 입력:");
			String email = br.readLine();
			
			System.out.println("전환번호 입력");
			String tel = br.readLine();
			
			String sql = "insert into customer values (?,?,?,?)";
					
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, tel);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
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
