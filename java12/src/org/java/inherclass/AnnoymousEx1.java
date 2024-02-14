package org.java.inherclass;

interface In1{
	void m1();
}
interface In2{
	void m2();
}
interface In3 extends In1,In2{
	void m3();
}
class InterMain implements In3{

	@Override
	public void m1() {
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}
	
}



public class AnnoymousEx1 {

	public static void main(String[] args) {
		// annoymouse class 익명(무명)클래스 (이름이 없는 클래스)
		// 하나의 일만 한다. -> 구현객체 대신 사용 
		
		In1 in1 = new InterMain();
		In2 in2 = new InterMain();
		In3 in3 = new InterMain();
		
		
		In1Sub insub1=new In1Sub();
		insub1.m1();
		
		
		
		In1 in12=new In1() {
			@Override
			public void m1() {
				System.out.println("anomymous클래스 (익명클래스) 구현,");
			}
			//In3
			new In3() {
				
			
			
		
			
			
			
		}
		}
		}
}
