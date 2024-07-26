package board;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("작성자명 입력:");
			String writer = br.readLine();
			
			System.out.println("비밀번호 입력:");
			String passwd = br.readLine();
			
			System.out.println("제목 입력:");
			String subject = br.readLine();
			
			System.out.println("내용 입력:");
			String content = br.readLine();
			
			String sql = "insert into board(no, writer,passwd,subject, content, reg_date)";
					sql += " values(board_seq.nextval,?,?,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
					
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("삽입 성공");
			}else {
				System.out.println("삽입 실패");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				
			}
		}
	}

}
