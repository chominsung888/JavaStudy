package org.java.exceptionEx;

public class ExceptionEx8 {

	public static void main(String[] args) {
		
		System.out.println("Exception");
		
		String userId=null;
			
		try {
			System.out.println("���ܸ� ������.");
//			Exception e=new Exception("���� �߻�");
//			throw e;
			
			//throw new Exception("���� �޼���");
			//1.ȸ������ 2.�α��� 3.���̵�üũ 4.�˻�
//			System.out.println("�������");
			if(userId==null) //  ��ġ �ϴ���?
			throw new IllegalAccessError("���̵� �����ϴ�"); 
	// System.out.println("�������");		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		System.out.println("���� ����");
		
		
		
		
	}
}
