package org.java.oopEx;

public class ClassBasic5 {
	public static int num1;
	//�ɹ�	
	//�ʵ�
	private String userId; //�ν��Ͻ� �ɹ� -> new ����
	private String userPw; //�ν��Ͻ� �ɹ� -> new ����
	public int age; 		//�ν��Ͻ� �ɹ� -> new ����
	public static String projectName; // Ŭ����(static)�ɹ�
	
	// ������ -> contstruct ->�ż���
	// ��ȯŸ�� void -> ����
	// ��ü ������, ��ü ������ ����
	
//	public ClassBasic5() {
		//�ڵ����� ����
//		System.out.println("�⺻������");
//	}
	
	//�ż��� 
	public void instanceMathod1() {
		this.userId="m11";
		this.userPw="1111";
		this.age=11;
		 // �ν��Ͻ� �ż��忡�� Ŭ�����ɹ��� ���� Ŭ����.�ɹ��� ��� ����
		ClassBasic5.projectName="WEB12";
		System.out.println("�ν��Ͻ��ż���");//�ν��Ͻ� �ɹ� -> new ����
		
		classMethode();
	}
	public static void classMethode() {
		//static�ż��忡���� static�ʵ常 ��밡��
//		userId=100;
		ClassBasic5.projectName="WEB13";
		System.out.println("Ŭ���� �ż���");// Ŭ����(static)�ɹ�
		//static�ż��忡���� static�ż��常 ��밡��
//		instanceMathod1();
	}
	
	public void m1(String[] str) {
		System.out.println("m1�ż���");
	}
	
	// getters,setters -> private �ʵ忡 �ܺ� ���� ���
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
	
}
	
	
	
	
	
	
	

