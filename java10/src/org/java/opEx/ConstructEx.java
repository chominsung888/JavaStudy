package org.java.opEx;

public class ConstructEx {
	
	private int num1;
	private int num2;
	
	
	public ConstructEx() {
	System.out.println("�⺻ ������");	
	}
			//�Ű����� -> ��������
	public ConstructEx(int num1) {
		this.num1=num1;
	}
	//AllargsConstruct
	public ConstructEx(int num1 ,int num2) {
		this.num2=num2;
	}
	
	
	
	
}
