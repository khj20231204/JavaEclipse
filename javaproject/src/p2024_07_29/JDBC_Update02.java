package p2024_07_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Update02 {

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
			
			System.out.print("회원번호를 입력?");
			int no = Integer.parseInt(br.readLine());
			System.out.print("수정할 회원이름 입력?");
			String name = br.readLine();			
			System.out.print("수정할 이메일주소 입력?");
			String email = br.readLine();			
			System.out.print("수정할 전화번호 입력?");
			String tel = br.readLine();			
			System.out.print("수정할 주소 입력?");
			String address = br.readLine();			
			
String sql = "update customer set name=?, email=?,";
	   sql += "tel=?, address=?, reg_date=now() where no=?";
	   
	   		pstmt = con.prepareStatement(sql);
	   		pstmt.setString(1, name);
	   		pstmt.setString(2, email);
	   		pstmt.setString(3, tel);
	   		pstmt.setString(4, address);
	   		pstmt.setInt(5, no);
	   		
	   		int result = pstmt.executeUpdate(); // update SQL문 실행
	   		if(result == 1) {
	   			System.out.println("회원정보 수정 성공");	
	   		}else {
	   			System.out.println("회원정보 수정 실패");	
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
