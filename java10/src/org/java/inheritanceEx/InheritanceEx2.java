package org.java.inheritanceEx;

//�׽�Ʈ��
class A {
	int a;

	public void m1() {
		System.out.println("AŬ���� m1()");
	}
}

class B extends A {
	int b;

	@Override
	public void m1() {
		System.out.println("BŬ���� m1()�������̵�");

	}
	void m2() {
		System.out.println("BŬ���� m2()�������̵�");
	}

}

class C extends B {
	int c;

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		super.m1();
	}

	public void m3() {
		System.out.println("CŬ���� m3()");
	}
}

public class InheritanceEx2 {
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.a = 10;
		a1.m1();
		
		B b1 = new B();
		b1.a = 10;
		b1.b = 20;
		b1.m1();
		b1.m2();

		C c1 = new C();
		c1.a = 10;
		c1.b = 20;
		c1.c = 30;
		c1.m1();
		c1.m2();
		c1.m3();

	}
}
