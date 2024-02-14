package org.java.inheritanceEx;

class Parent{
	int a;
	void m1() {
		System.out.println("부모클래스m1()");
	}
}
class sub1 extends Parent{
	int b;
	void m2() {
		System.out.println("자식클래스 m2()");
	}
}




public class InheritanceEx5 {
 
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.a=10;
		p1.m1();
		
		sub1 s1=new sub1();
		
	}
}
