package org.java.oopEx;

public class OverLoadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("overloading");
		System.out.println(1);
		System.out.println(1.1);
		System.out.println(1.1f);
		System.out.println(new String("ddd"));
		System.out.println(new char[]{'a','b'});
		
		OverLoadingEx over1=new OverLoadingEx();
		
		//�����ε�
		over1.method1();
		over1.method1(100);
		over1.method1("m111");
		over1.method1(20,"m111");
		over1.method1("m222",30);
		
		

	}

}
