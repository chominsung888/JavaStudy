package org.java.oopEx;

public class OverLoadingEx {
	
	private String userId;
	private String userPw;
	private int age;
	
	//�ż��� �����ε�
	public void method1() {
		System.out.println("metgod1");
	}
	public void method1(String userId) {
		this.userId=userId;
		System.out.println(userId);
	}
	public void method1(int age) {
		this.age=age;
		System.out.println(age);
	}		
	public void method1(String uesrId, int age) {
		this.userId=userId;
		this.age=age;
		System.out.println(this.userId+","+this.age);

	
	}
	//�����ε�X
	// return X
//	public int method1() {
//	return 1;
//}
	//�Ű����� Ÿ���� ������ �̸��� ��� ���� �����ε��� ��� �ȵȴ�.
//	public void method1(String id) {
//		return 1;
//	}
	public void method1(int age, String uesrId) {
		
	}
	
}
