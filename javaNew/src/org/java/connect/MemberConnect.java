package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MemberConnect {

	public static Connection geConnection() {
		Connection conn= null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// DB URL
		String user = "system"; // �������̵�
		String password = "1234";// ���� ��й�ȣ
		String driver = "oracle.jdbc.driver.OracleDriver";

		// 1.driver ã��

		try {
			Class.forName(driver);
			System.out.println("����̹� OK!");
			// 2. DB���� ã��
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect OK!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� NO!");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("DB Connect Fail!");
			e.printStackTrace();
		}
		return conn;
	}
}
