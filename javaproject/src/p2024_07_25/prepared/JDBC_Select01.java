package p2024_07_25.prepared;

import java.io.*;
import java.sql.*;

public class JDBC_Select01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;	//데이터베이스 접속
		PreparedStatement pstmt = null; 	//sql문 실행
		ResultSet rs01 = null;	
		ResultSet rs02 = null;	
		
		int cnt = 0; //회원수
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
		
			String sql = "select count(*) as num from customer";
			
			pstmt = con.prepareStatement(sql);
			rs01 = pstmt.executeQuery();
			
			while(rs01.next()) {
				int num = rs01.getInt("num");
				System.out.println("총 갯수:"+num);
			}
			
			sql = "select * from customer";
			
			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery();
			
			while(rs02.next()) {
				int no = rs02.getInt("no");
				String name = rs02.getString("name");
				String email = rs02.getString("email");
				String tel = rs02.getString("tel");
				
				System.out.println(no + "\t" + name + "\t" + email + "\t" + tel);
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
