package org.java.oopEx;

public class ConstructEx {
	
	private String userId;
	private String userPw;
	private int age;
	
	public void ConstrunctEx() {
		System.out.println("�⺻������");
	}
	public ConstructEx(String userId) {
		this.userId=userId;
		System.out.println("�ٸ�������1");
	}
	public ConstructEx(String userId,String userPw) {
		this.userId=userId;
		this.userPw=userPw;
		System.out.println("�ٸ� ������2");
	}
	public ConstructEx(String userId,String userPw, int age) {
		this.userId=userId;
		this.userPw=userPw;
		this.age=age;
		System.out.println("�ٸ� ������3");
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
	
}
