package org.java.opEx;

public class ConstructEx {
	
	private int num1;
	private int num2;
	
	
	public ConstructEx() {
	System.out.println("기본 생성자");	
	}
			//매개변수 -> 지역변수
	public ConstructEx(int num1) {
		this.num1=num1;
	}
	//AllargsConstruct
	public ConstructEx(int num1 ,int num2) {
		this.num2=num2;
	}
	
	
	
	
}
