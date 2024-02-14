package org.java.concect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	// ���� -> Connection DB���� ��ü
	public static Connection getConnection() {

		Connection conn = null;

//		Connection conn=null; //Ŀ�ؼ� ��ü �⺻ null
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB URL
		String user = "system"; // ���̵�
		String password = "1234";// ��й�ȣ
		String driver = "oracle.jdbc.driver.OracleDariver";

		// 1. ����̹�ã��
		try {
			Class.forName(driver);
			System.out.println("����̹� OK");

			// DB ����
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB���� Success!!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB���� Fail!!");
			e.printStackTrace();
		}
		// conn -> null -> DB���� ����

		return conn;

	}

}
