package org.java.opEx;

public class OverLoadingEx {
	
	//�����ε� -> �ż���, ����
	public void m1() {
		System.out.println("m1 �ż���");
	}
	//����Ÿ�� x
//	public int m1() {}
	public void m1(int num1) {
		System.out.println("m1()�����ε�,�ŰԺ�������");
	}
	public void m1(String num1) {
		System.out.println("m1() �����ε�,�ŰԺ��� Ÿ��");
	}
	//�Ű����� �̸�X
	//public void m1(String num2) {}
	
}
