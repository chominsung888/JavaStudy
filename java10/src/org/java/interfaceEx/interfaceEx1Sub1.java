package org.java.interfaceEx;

//클래스 implements 인터페이스 , 클래스-> 인터페이스
public class interfaceEx1Sub1 implements interfaceEx1 , InterfaceEx2{

	@Override
	public void ab1() {
		
		System.out.println("추상매서드 구현");
	}
	@Override
	public void defaultMethod() {
		System.out.println("선택 매서드 -> default");
	}
	@Override
	public void inter2() {
		System.out.println("추상 매서드 inter2");
	}
	@Override
	public void inter(int num1, int num2) {
		System.out.println("선택 매서드 -> default");
	}

}
