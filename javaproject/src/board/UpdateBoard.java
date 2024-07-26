package board;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateBoard {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("수정할 글번호를 입력하세요:");
			int no = Integer.parseInt(br.readLine());
			
			System.out.println("작성자명을 입력하세요:");
			String writer = br.readLine();
			
			System.out.println("비밀번호 값을 입력하세요:");
			String passwd = br.readLine();
			
			System.out.println("제목을 입력하세요");
			String subject = br.readLine();
			
			System.out.println("내용을 입력하세요");
			String content = br.readLine();
			
			String sql = "update board set writer=?, passwd=?, subject=?, content=?, reg_date=sysdate where no=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, no);
			
 			int result = pstmt.executeUpdate();
			
 			if(result == 1) {
 				System.out.println("정상 수정");
 			}else {
 				System.out.println("수정 실패");
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
