package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;

//DB���� Ŭ���� -> 1.����̹� ã��, 2.DB���� 
public class DBConnect2 {
	
	public static Connection getConnection() {
		
		Connection conn=null; // DB���� 
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="1234";
		String driver="oracle.jdbc.driver.OracleDriver";
		//1.����̹� ã��
		Class.forName(driver);
		System.out.println("����̹� OK");
		//2.DB����
	conn=	DriverManager.getConnection(url,user,password);
	}catch (ClassNotFoundException e);
	System.out.println("DB���� Success!!");
		
		return 
	}
}
