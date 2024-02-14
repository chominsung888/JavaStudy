package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//������ ���̽� ����
public class DBConnect {
	
	//DB ���� -> ����(static)�ż���
	public static Connection getConnection() {
		//������ ���̽� ����-> ����(CURD)
		// DB���� Ŭ���� 
		Connection conn=null;//null -> Object�� �⺻ �� 
		
		
		String user="system"; //����� ����
		String password="1234"; //����� ��й�ȣ
									//@ȣ��Ʈ:��Ʈ:DB�� 
		String url ="jdbc:oracle:thin:@localhost:1521:xe";//�����ͺ��̽� URL(xe����)
		String driver="oracle.jdbc.driver.OracleDriver";
		
		
		//DB���� ����
		// 1. ����̹� ã�� 
		try {
			Class.forName(driver);
		System.out.println("����̹�OK");
		// 2.DB���� -> DB���� ���� -> NULL
		conn=DriverManager.getConnection(url, user, password);
		System.out.println("DB���� Success!!");
		
		
		}catch (ClassNotFoundException e) {
			System.out.println("����̹� NO");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
}
