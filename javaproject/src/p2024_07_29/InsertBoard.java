package p2024_07_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {

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

			System.out.print("작성자명을 입력?");
			String writer = br.readLine();
			System.out.print("비밀번호를 입력?");
			String passwd = br.readLine();
			System.out.print("제목을 입력?");
			String subject = br.readLine();
			System.out.print("내용을 입력?");
			String content = br.readLine();
			
String sql = "insert into board(writer,passwd,subject,content,reg_date) ";
       sql += " values(?,?,?,?,sysdate())";			
			
       		pstmt = con.prepareStatement(sql);
       		pstmt.setString(1, writer);
       		pstmt.setString(2, passwd);
       		pstmt.setString(3, subject);
       		pstmt.setString(4, content);
       		
       		int result = pstmt.executeUpdate(); //insert sql문 실행
       		if(result == 1) {
       			System.out.println("글작성 성공");
       		}else {
       			System.out.println("글작성 실패");
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
