package org.java.interfaceEx;

public class InterfaceEx1Main {

	public static void main(String[] args) {
		
		//2. 객체를 생성 못한다.
		//new InterfaceEX1();
		
	interfaceEx1Sub1 in1 =new interfaceEx1Sub1();
	in1.ab1();
	in1.defaultMethod();
	in1.inter2();
	in1.inter2(100,200);
	//인터페이스는 객체를 생성 X ->ㅣ 반드시 구현객체를 통해서 실행 
	interfaceEx1 in2=new interfaceEx1Sub1();
	in2.ab1();
	in2.defaultMethod();
	
	interfaceEx1 in2=new interfaceEx1Sub1();
	in2.inter2();
	in2.inter2(200,300);
	
	}
}
