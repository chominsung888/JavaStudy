package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		
		Connection conn=null;
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system"; // 계정아이디
		String password = "1234";// 계정 비밀번호
		String driver = "oracle.jdbc.driver.OracleDriver";

		//driver 찾기
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 OK!");
			conn= DriverManager.getConnection(url,user,password);
			System.out.println("DB Connect Ok!");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 NO!");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("DB Connect Fail!");
			e.printStackTrace();
		}
		return conn;
	}
}
