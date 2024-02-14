package org.java.oopEx2;

public class ClassBasicEx4 {
	public static void main(String[] args) {
		
	
	ClassBasic4 c1=new ClassBasic4();
	
	c1.method1();
	c1.method1();
	
	c1.method2(100, 200);
	c1.method2(400, 200);
	//매서드의 반환 값은 호출(call)한 수 그 위치에서 반환 한다.
	int m1=c1.method3();
	System.out.println(m1);
	System.out.println(c1.method3()+300+100);
	String s1=c1.method31();
	System.out.println(c1.method31());
	
	int sum=c1.method4(300,400);
	System.out.println("합계:"+sum);
	System.out.println(c1.method4(100,200));
	
	
	
}
}