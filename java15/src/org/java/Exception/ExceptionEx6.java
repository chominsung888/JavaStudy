package org.java.Exception;

public class ExceptionEx6 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹�OK!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹�No!");
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ��������");
		
		
	}
}
