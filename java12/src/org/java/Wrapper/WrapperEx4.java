package org.java.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx4 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		System.out.println("자동언방식(객체형-> 기본형)");
		
		Byte b=new Byte((byte)10); // b-> Wrapper(객체형)
		byte b2= b.byteValue(); //객체형 -> 기본형
		
		Short s=new Short((short)10);
		short s2=s.shortValue();
		
		Integer i = new Integer(10);
		int i2=i.intValue();
		
		Long l=new Long(10);
		long l2=l.longValue();
		
		Float f=new Float(1.1f);
		float f2=f.floatValue();
		
		Double d=new Double(1.1);
		double d2=d.doubleValue();
		
		Character ch=new Character('a');
		char ch2= ch.charValue();
		
		Boolean bool = new Boolean(false);
		boolean bool2=bool.booleanValue();
		
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(ch2);
		System.out.println(bool2);
	}
}
