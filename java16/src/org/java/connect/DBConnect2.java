package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;

//DB연동 클래스 -> 1.드라이버 찾기, 2.DB연동 
public class DBConnect2 {
	
	public static Connection getConnection() {
		
		Connection conn=null; // DB연동 
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="1234";
		String driver="oracle.jdbc.driver.OracleDriver";
		//1.드라이버 찾기
		Class.forName(driver);
		System.out.println("드라이버 OK");
		//2.DB연동
	conn=	DriverManager.getConnection(url,user,password);
	}catch (ClassNotFoundException e);
	System.out.println("DB연동 Success!!");
		
		return 
	}
}
