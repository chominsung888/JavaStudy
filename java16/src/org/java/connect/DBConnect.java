package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//데이터 베이스 접속
public class DBConnect {
	
	//DB 접속 -> 공유(static)매서드
	public static Connection getConnection() {
		//데이터 베이스 접속-> 서비스(CURD)
		// DB연동 클래스 
		Connection conn=null;//null -> Object의 기본 값 
		
		
		String user="system"; //사용자 계정
		String password="1234"; //사용자 비밀번호
									//@호스트:포트:DB명 
		String url ="jdbc:oracle:thin:@localhost:1521:xe";//데이터베이스 URL(xe무료)
		String driver="oracle.jdbc.driver.OracleDriver";
		
		
		//DB연동 순서
		// 1. 드라이버 찾기 
		try {
			Class.forName(driver);
		System.out.println("드라이버OK");
		// 2.DB연동 -> DB연동 실패 -> NULL
		conn=DriverManager.getConnection(url, user, password);
		System.out.println("DB연동 Success!!");
		
		
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 NO");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
}
