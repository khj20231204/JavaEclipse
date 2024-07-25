package p2024_07_25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;	//데이터베이스 접속
		Statement stmt = null; 	//sql문 실행
		ResultSet rs = null;	//select로 검색한 데이터를 관리
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			stmt = con.createStatement();
			
			String sql = "Select * from customer";
			
			System.out.println("번호\t이름\t이메일\t\t전화번호");
			System.out.println("--------------------------------------------------");
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				System.out.println(rs.getInt("no")+"\t"+rs.getString("name")+"\t"+rs.getString("email")+"\t"+rs.getString("tel"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)	rs.close();
				if(stmt != null)stmt.close();
				if(con != null)	con.close();
			}catch(Exception e) {
				
			}
		}
			
	}

}
