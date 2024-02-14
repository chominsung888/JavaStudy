package org.java.oopEx;

public class OverLoadingEx {
	
	private String userId;
	private String userPw;
	private int age;
	
	//매서드 오버로딩
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
	//오버로딩X
	// return X
//	public int method1() {
//	return 1;
//}
	//매개인자 타입이 같으면 이름과 상관 없이 오버로딩이 허용 안된다.
//	public void method1(String id) {
//		return 1;
//	}
	public void method1(int age, String uesrId) {
		
	}
	
}
