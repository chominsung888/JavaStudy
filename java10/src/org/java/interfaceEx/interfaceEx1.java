package org.java.interfaceEx;

public interface interfaceEx1 {

	// 인터페이스 맴버 -> static맴버 , 추상 매서드, default매서드
	
//	int num1; //일반 맴버X 
	public static final int num2=100; //static 맴버 
	public abstract void ab1(); // 추상매서드
	
	public static void staticMethod() {
		System.out.println("static매서드");
	}
	//상속에 결정 0
	default void defaultMethod() {
		System.out.println("default 매서드");
	}
	
	
/*	public void m1() { 일반매서드 X
		System.out.println("일반 매서드");
		
	}
*/	
	
	
}
