package org.java.exceptionEx;

public class ExceptionEx9 {
	
	static void m1() throws Exception{
		System.out.println("���� �߻� �ż���");
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("Exception");
		
		// ���� �ż��带 ���� 
		//1. try~catch
/*		try {
		m1();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}*/
		//2. throws ���� ���� 
		m1();
		
		
		
	}
}
