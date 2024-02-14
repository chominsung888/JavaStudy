package org.java.inheritanceEx;

class A2{
	int a;
	
	//다향성(polymorghism)
	//오버로딩 -> 매서드명이 똑같고 매개인자(변수) 타입또는 갯수가 다른 경우 허용
	public A2() {
		super();//Object클래스 기본 생성자
		System.out.println("A2 기본생성자 , 자동 ");
	}
	public A2(int a) {
		this.a=a;
	}
	
	void m1() {
		System.out.println("A2 m1()");
	}
}
class B2 extends A2{
	int b;
	public B2() {
		super();//A2 클래스 기본 생성자
		System.out.println("B2 기본 생성자. 자동");
	}
	void m2() {
		System.out.println("B2 m2()");
		
		}
	
	
	}

	


public class InheritanceEx4 extends B2 {
	public InheritanceEx4() {
		super();
	}
	int c;
	public static void main(String[] args) {
		
		// 다형성(polymorphsim)
		//부모 타입의 객체 참조변수로 다양한 객체에 접근가능
		A2 a2=new A2();
		a2.a=10;
		a2.m1();
		
		a2=new B2();
		a2.a=10;
		a2.m1();
		
		a2=new InheritanceEx4();
		a2.a=10;
		a2.m1();
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
