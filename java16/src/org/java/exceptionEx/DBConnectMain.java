package org.java.exceptionEx;

import java.sql.Connection;

import org.java.connect.DBConnect;

public class DBConnectMain {

	public static void main(String[] args) {
		
		//DB����
		
	Connection conn=DBConnect.getConnection();
		
		if(conn==null) {
			System.out.println("DB ���� ����");
			//CRUD 
		}else {
			System.out.println("DB ���� ����");
			
		}
		System.out.println(conn);
	

		
	
	}
}
		
		
	
		
