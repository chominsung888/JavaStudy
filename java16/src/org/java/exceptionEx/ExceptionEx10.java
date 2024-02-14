package org.java.exceptionEx;

public class ExceptionEx10 {
class C1{
	void m1() {
		throw new IllegalArgumentException("아이디가 없습니다.");
	}
	//1.
	int[] arrInt=new int[5]; {
	try {
		for(int i=0; i<6; i++) {
			System.out.println(arrInt[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	//2.throw
//	throw new illegaIArgumentException("아이디가 없습니다.");
	C1 c1=new C1();
	c1.m1();


}
}
}
