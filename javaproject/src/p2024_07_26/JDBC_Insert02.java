package p2024_07_26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class JDBC_Insert02 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;	//데이터베이스 접속
		PreparedStatement pstmt = null; 	//sql문 실행
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("이름 입력:");
			String name = br.readLine();
			
			System.out.println("이메일 입력:");
			String email = br.readLine();
			
			System.out.println("전환번호 입력");
			String tel = br.readLine();
			
			System.out.println("주소 입력");
			String address = br.readLine();
			
			Timestamp ts = new Timestamp(System.currentTimeMillis());
			
			String sql = "insert into customer(no, name, email, tel, address, reg_date) values (customer_no_seq.nextval,?,?,?,?,sysdate)";
			//String sql = "insert into customer(no, name, email, tel, address, reg_date) values (customer_no_seq.nextval,?,?,?,?,?)";
					
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, tel);
			pstmt.setString(4, address);
			//pstmt.setTimestamp(5, ts);
			
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
