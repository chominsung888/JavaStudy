package org.java.interfaceEx;

//Ŭ���� implements �������̽� , Ŭ����-> �������̽�
public class interfaceEx1Sub1 implements interfaceEx1 , InterfaceEx2{

	@Override
	public void ab1() {
		
		System.out.println("�߻�ż��� ����");
	}
	@Override
	public void defaultMethod() {
		System.out.println("���� �ż��� -> default");
	}
	@Override
	public void inter2() {
		System.out.println("�߻� �ż��� inter2");
	}
	@Override
	public void inter(int num1, int num2) {
		System.out.println("���� �ż��� -> default");
	}

}
