package org.java.oopEx2;

public class ClassBasicEx4 {
	public static void main(String[] args) {
		
	
	ClassBasic4 c1=new ClassBasic4();
	
	c1.method1();
	c1.method1();
	
	c1.method2(100, 200);
	c1.method2(400, 200);
	//�ż����� ��ȯ ���� ȣ��(call)�� �� �� ��ġ���� ��ȯ �Ѵ�.
	int m1=c1.method3();
	System.out.println(m1);
	System.out.println(c1.method3()+300+100);
	String s1=c1.method31();
	System.out.println(c1.method31());
	
	int sum=c1.method4(300,400);
	System.out.println("�հ�:"+sum);
	System.out.println(c1.method4(100,200));
	
	
	
}
}