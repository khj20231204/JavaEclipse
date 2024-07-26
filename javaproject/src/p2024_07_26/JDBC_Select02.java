package p2024_07_26;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import oracle.sql.TIMESTAMP;

public class JDBC_Select02 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;	//데이터베이스 접속
		PreparedStatement pstmt = null; 	//sql문 실행
		ResultSet rs = null;
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "select * from customer order by no desc";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("no \t이름 \t이메일 \t전화 \t주소 \t날짜");
			
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				String address = rs.getString("address");
				//Date date = rs.getDate("reg_date");
				//Time date = rs.getTime("reg_date");
				Timestamp date = rs.getTimestamp("reg_date");
				
				//System.out.println(no+"\t"+name+"\t"+email+"\t"+tel+"\t"+address+"\t"+date);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
