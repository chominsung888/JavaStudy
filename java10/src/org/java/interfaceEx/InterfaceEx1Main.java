package org.java.interfaceEx;

public class InterfaceEx1Main {

	public static void main(String[] args) {
		
		//2. ��ü�� ���� ���Ѵ�.
		//new InterfaceEX1();
		
	interfaceEx1Sub1 in1 =new interfaceEx1Sub1();
	in1.ab1();
	in1.defaultMethod();
	in1.inter2();
	in1.inter2(100,200);
	//�������̽��� ��ü�� ���� X ->�� �ݵ�� ������ü�� ���ؼ� ���� 
	interfaceEx1 in2=new interfaceEx1Sub1();
	in2.ab1();
	in2.defaultMethod();
	
	interfaceEx1 in2=new interfaceEx1Sub1();
	in2.inter2();
	in2.inter2(200,300);
	
	}
}
