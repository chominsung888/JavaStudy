package org.java.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx3 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		System.out.println("�ڽ�(�⺻�ڷ���->��ü��(Wrapper)��ȯ");
		
		int i =10; // i-> int 
		Integer in1=i; //int -> Integer(�ڽ�)
		
		// primitive type
		byte b=10;
		int j=10;
		long l=10;
		short s= 10;
		float f=1.1f;
		double d=1.1;
		char ch='a';
		boolean bool=false;
		
		//�⺻ Ÿ�� -> ��ü��(Wraper) -> �ڽ�
		Byte b2= b;
		Short s2=s;
		Integer i2=j;
		Float f2 =f;
		Double d2=new Double(d);
		Character ch2=new Character(ch);
		Boolean boo12=new Boolean(bool);
		
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(ch2);
		System.out.println(boo12);
		
		System.out.println();
		
		System.out.println(i==i2);
		
		//�÷��� �����ӿ�ũ(�÷���) -> ��ü�� �׷�ȭ 
		
		List<Integer> list=new ArrayList<Integer>();
		
		
	}
}
	

