package org.java.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx3 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		System.out.println("박싱(기본자료형->객체형(Wrapper)변환");
		
		int i =10; // i-> int 
		Integer in1=i; //int -> Integer(박싱)
		
		// primitive type
		byte b=10;
		int j=10;
		long l=10;
		short s= 10;
		float f=1.1f;
		double d=1.1;
		char ch='a';
		boolean bool=false;
		
		//기본 타입 -> 객체형(Wraper) -> 박싱
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
		
		//컬렉션 프레임워크(컬렉션) -> 객체를 그룹화 
		
		List<Integer> list=new ArrayList<Integer>();
		
		
	}
}
	

