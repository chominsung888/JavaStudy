package org.java.opEx;

public class OverLoadingEx {
	
	//오버로딩 -> 매서드, 생성
	public void m1() {
		System.out.println("m1 매서드");
	}
	//반한타입 x
//	public int m1() {}
	public void m1(int num1) {
		System.out.println("m1()오버로딩,매게변수갯수");
	}
	public void m1(String num1) {
		System.out.println("m1() 오버로딩,매게변수 타입");
	}
	//매개변수 이름X
	//public void m1(String num2) {}
	
}
